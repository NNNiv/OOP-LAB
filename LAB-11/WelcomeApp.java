package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class WelcomeApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a label with the specified message
        Label welcomeLabel = new Label("Welcome to JavaFX programming");

        // Set the text color to Magenta
        welcomeLabel.setTextFill(Color.MAGENTA);

        // Create a FlowPane layout
        FlowPane flowPane = new FlowPane();
        
        // Set the horizontal and vertical gap of the FlowPane
        flowPane.setHgap(10);
        flowPane.setVgap(10);

        // Add the label to the FlowPane
        flowPane.getChildren().add(welcomeLabel);

        // Create a Scene with the FlowPane as its root, and set width and height
        Scene scene = new Scene(flowPane, 500, 200);

        // Set the title of the Stage
        primaryStage.setTitle("This is the first JavaFX Application");

        // Set the Scene for the Stage
        primaryStage.setScene(scene);

        // Show the Stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
	
