import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane bp = new BorderPane();

        bp.setTop(new Label("Top Region"));
        bp.setBottom(new Label("Bottom Region"));
        bp.setLeft(new Label("Left Region"));
        bp.setRight(new Label("Right Region"));
        bp.setCenter(new Label("Center Region"));

        Scene scene = new Scene(bp, 400, 300);
        stage.setScene(scene);
        stage.setTitle("BorderPane Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
