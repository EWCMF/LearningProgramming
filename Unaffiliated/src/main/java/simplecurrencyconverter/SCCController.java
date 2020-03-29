package simplecurrencyconverter;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

public class SCCController {
    @FXML
    private ChoiceBox<String> fromChoiceBox, toChoiceBox;

    @FXML
    private Label inputLabel, resultLabel, exchangeLabel;

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
        JsonNode root = new ObjectMapper().readTree(new URL("https://api.exchangeratesapi.io/latest"));
        System.out.println(root.path("rates").path("DKK").asDouble());
    }
}
