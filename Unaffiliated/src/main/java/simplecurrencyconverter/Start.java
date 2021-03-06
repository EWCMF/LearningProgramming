package simplecurrencyconverter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Start extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("SCC.fxml"));
        stage.setTitle("Simple Currency Converter");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.getIcons().add(new Image("simplecurrencyconverter/icon.png"));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
