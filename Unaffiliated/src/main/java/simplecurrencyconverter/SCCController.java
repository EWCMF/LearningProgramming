package simplecurrencyconverter;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

public class SCCController {
    private double xOffset;
    private double yOffset;

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
        Stage parent = (Stage) inputLabel.getScene().getWindow();
        if (fromChoiceBox.getValue() == null || toChoiceBox.getValue() == null) {
            errorMessage("Choose a currency in both boxes.", parent);
            return;
        }
        if (fromChoiceBox.getValue().equals(toChoiceBox.getValue())) {
            errorMessage("The selected currencies cannot be the same.", parent);
            return;
        }
        if (inputTextField.getText().equals("")) {
            errorMessage("Type a number in the input field.", parent);
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
            errorMessage("Only numbers are allowed in the input field.", parent);
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

    private void errorMessage(String message, Stage parent) {
        Label label = new Label(message);
        label.setPadding(new Insets(32));
        Button button = new Button();
        button.setText("Ok");
        button.setOnAction(event -> {
            Stage stage = (Stage) button.getScene().getWindow();
            stage.close();
        });
        Stage stage = new Stage();
        VBox vBox = new VBox(label, button);
        vBox.setStyle("-fx-border-color: black;" + "-fx-background-color: GhostWhite");

        vBox.setAlignment(Pos.CENTER);
        vBox.setOnMousePressed(mouseEvent -> {
            xOffset = mouseEvent.getSceneX();
            yOffset = mouseEvent.getSceneY();
        });
        vBox.setOnMouseDragged(mouseEvent -> {
            stage.setX(mouseEvent.getScreenX() - xOffset);
            stage.setY(mouseEvent.getScreenY() - yOffset);
        });
        Scene scene = new Scene(vBox, 400, 150);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setX(parent.getX() + 50);
        stage.setY(parent.getY() + 50);
        stage.show();
    }
}
