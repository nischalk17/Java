import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneExample extends Application {

    @Override
    public void start(Stage stage) {
        FlowPane flow = new FlowPane();

        // Adding buttons
        flow.getChildren().addAll(
                new Button("Button 1"),
                new Button("Button 2"),
                new Button("Button 3"),
                new Button("Button 4"),
                new Button("Button 5")
        );

        Scene scene = new Scene(flow, 400, 300);
        stage.setScene(scene);
        stage.setTitle("FlowPane Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
