package simplecurrencyconverter;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

public class SCCController {
    @FXML
    private ChoiceBox<String> fromChoiceBox, toChoiceBox;

    @FXML
    private Label inputLabel, resultLabel, exchangeLabel;

    @FXML
    private TextField inputTextField;

    public void initialize() {
        inputLabel.setVisible(false);
        resultLabel.setVisible(false);
        exchangeLabel.setVisible(false);

        List<String> currencies = new LinkedList<>();
        currencies.add("Danish Kroner");
        currencies.add("US Dollar");
        currencies.add("Euro");
        currencies.add("Japanese Yen");
        fromChoiceBox.getItems().addAll(currencies);
        toChoiceBox.getItems().addAll(currencies);
    }

    public void convert() throws IOException {
        if (fromChoiceBox.getValue().equals("") || toChoiceBox.getValue().equals("") || inputTextField.getText().equals("")) {
            return;
        }
        String failSafe = inputTextField.getText();
        if (inputTextField.getText().contains(",")) {
            failSafe = inputTextField.getText().replaceAll(",", ".");
        }
        double inputValue;
        try {
            inputValue = Double.parseDouble(failSafe);
        } catch (NumberFormatException e) {
            return;
        }

        String fromCurrency = getCurrencyCode(fromChoiceBox);
        String toCurrency = getCurrencyCode(toChoiceBox);

        JsonNode root = new ObjectMapper().readTree(new URL("https://api.exchangeratesapi.io/latest?base=" + fromCurrency));

        inputLabel.setVisible(true);
        inputLabel.setText(String.format("%.2f", inputValue) + " " + fromCurrency);

        double exchangeRate = root.path("rates").path(toCurrency).asDouble();
        double result = inputValue * exchangeRate;

        resultLabel.setText(String.format("%.2f", result) + " " + toCurrency);
        resultLabel.setVisible(true);

        exchangeLabel.setText(String.format("%.5f", exchangeRate));
        exchangeLabel.setVisible(true);
    }

    private String getCurrencyCode(ChoiceBox<String> choiceBox) {
        String currency = choiceBox.getValue();
        switch (currency) {
            case "Danish Kroner":
                return "DKK";
            case "US Dollar":
                return "USD";
            case "Euro":
                return "EUR";
            case "Japanese Yen":
                return "JPY";
        }
        return null;
    }
}
