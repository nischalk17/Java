// JavaFX program that includes all the UI controls:
// Label, TextField, Button, RadioButton, CheckBox, Hyperlink, Menu, Tooltip,
// FileChooser (dialog class)




import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class AllUiControls extends Application {

    @Override
    public void start(Stage stage) {
        // Label
        Label label = new Label("Enter your name:");

        // TextField
        TextField textField = new TextField();

        // Button with Tooltip
        Button button = new Button("Submit");
        Tooltip.install(button, new Tooltip("Click to submit your name"));

        // RadioButtons in a ToggleGroup
        RadioButton rb1 = new RadioButton("Male");
        RadioButton rb2 = new RadioButton("Female");
        ToggleGroup genderGroup = new ToggleGroup();
        rb1.setToggleGroup(genderGroup);
        rb2.setToggleGroup(genderGroup);

        // CheckBox
        CheckBox cb = new CheckBox("I agree to terms");

        // Hyperlink
        Hyperlink link = new Hyperlink("Visit My Github");
        link.setOnAction(e -> System.out.println("Opening: https://github.com/nischalk17"));

        // MenuBar with one Menu
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem openItem = new MenuItem("Open File");
        fileMenu.getItems().add(openItem);
        menuBar.getMenus().add(fileMenu);

        // FileChooser on menu item click
        openItem.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open Resource File");
            fileChooser.showOpenDialog(stage);
        });

        // Arrange all in a VBox
        VBox vbox = new VBox(10, menuBar, label, textField, rb1, rb2, cb, button, link);

        // Scene setup
        Scene scene = new Scene(vbox, 300, 400);
        stage.setScene(scene);
        stage.setTitle("JavaFX All UI Controls");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
