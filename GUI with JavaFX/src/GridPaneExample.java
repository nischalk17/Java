//grid.add(node, colIndex, rowIndex) places a node in the grid.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application {

    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();

        // Add buttons at specific row,column positions
        grid.add(new Button("Button 1"), 0, 0); // column 0, row 0
        grid.add(new Button("Button 2"), 1, 0); // column 1, row 0
        grid.add(new Button("Button 3"), 0, 1); // column 0, row 1
        grid.add(new Button("Button 4"), 1, 1); // column 1, row 1

        Scene scene = new Scene(grid, 300, 200);
        stage.setScene(scene);
        stage.setTitle("GridPane Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
