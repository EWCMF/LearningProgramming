package ProgrammingExercise14.Exercise1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise1 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setGridLinesVisible(true);
        Image image = new Image("ProgrammingExercise14/Exercise1/dannebrug.jpg");
        ImageView imageView = new ImageView(image);
        ImageView imageView2 = new ImageView(image);
        ImageView imageView3 = new ImageView(image);
        ImageView imageView4 = new ImageView(image);
        gridPane.add(imageView, 0, 0);
        gridPane.add(imageView2, 0, 1);
        gridPane.add(imageView3, 1, 0);
        gridPane.add(imageView4, 1, 1);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
