import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxExample extends Application {

    @Override
    public void start(Stage stage) {
        HBox hbox = new HBox(10);  // 10 pixels spacing between nodes

        hbox.getChildren().addAll(
                new Button("Button 1"),
                new Button("Button 2"),
                new Button("Button 3")
        );

        Scene scene = new Scene(hbox, 300, 100);
        stage.setScene(scene);
        stage.setTitle("HBox Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
