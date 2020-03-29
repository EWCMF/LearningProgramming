package simplecurrencyconverter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("SCC.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

//    public static void main(String[] args) throws IOException {
//        JsonNode jsonNode = new ObjectMapper().readTree(new URL("https://api.exchangeratesapi.io/latest"));
//        System.out.println(jsonNode.get("base"));
//    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
