package ProgrammingExercise14.Exercise2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise2 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setGridLinesVisible(true);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ImageView imageView = new ImageView(randomTicTac());
                imageView.setFitHeight(200);
                imageView.setFitWidth(200);
                gridPane.add(imageView, i, j);
            }
        }
        Scene scene = new Scene(gridPane, 600, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    private static Image randomTicTac() {
        byte random = (byte) (Math.random() * 3 + 1);
        Image image = null;
        switch (random) {
            case 1:
                image = new Image("ProgrammingExercise14/Exercise2/o.png");
                break;
            case 2:
                image = new Image("ProgrammingExercise14/Exercise2/x.png");
                break;
            case 3:
                break;
        }
        return image;
    }
}
