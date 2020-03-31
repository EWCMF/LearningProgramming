package ProgrammingExercise14.Exercise3;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise3 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        GridPane pane = new GridPane();
        pane.setHgap(5);
        Label label1 = new Label("" + (int) (Math.random() * 32 + 1));
        Label label2 = new Label("" + (int) (Math.random() * 32 + 1));
        Label label3 = new Label("" + (int) (Math.random() * 32 + 1));
        pane.add(label1, 0, 0);
        pane.add(label2, 1, 0);
        pane.add(label3, 2, 0);
        pane.setAlignment(Pos.CENTER);
        pane.setGridLinesVisible(true);
        pane.setPrefSize(400, 400);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
