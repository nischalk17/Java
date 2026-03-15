import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxExample extends Application {

    @Override
    public void start(Stage stage) {
        VBox vbox = new VBox(10);  // 10 pixels spacing between nodes

        vbox.getChildren().addAll(
                new Button("Button 1"),
                new Button("Button 2"),
                new Button("Button 3")
        );

        Scene scene = new Scene(vbox, 200, 150);
        stage.setScene(scene);
        stage.setTitle("VBox Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
