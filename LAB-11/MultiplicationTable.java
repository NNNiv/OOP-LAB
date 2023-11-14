package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MultiplicationTable extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create controls
        Label promptLabel = new Label("Enter an integer:");
        TextField numberField = new TextField();
        Button showTableButton = new Button("Show Multiplication Table");
        Label resultLabel = new Label();

        // Create a FlowPane layout
        FlowPane flowPane = new FlowPane();
        flowPane.setPadding(new Insets(10, 10, 10, 10));
        flowPane.setHgap(10);
        flowPane.setVgap(10);

        // Set action for the button
        showTableButton.setOnAction(e -> {
            // Get the input number from the TextField
            try {
                int number = Integer.parseInt(numberField.getText());

                // Display multiplication table in the resultLabel
                StringBuilder table = new StringBuilder();
                for (int i = 1; i <= 10; i++) {
                    int result = number * i;
                    table.append(number).append(" * ").append(i).append(" = ").append(result).append("\n");
                }
                resultLabel.setText(table.toString());
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter a valid integer.");
            }
        });

        // Add controls to the FlowPane
        flowPane.getChildren().addAll(promptLabel, numberField, showTableButton, resultLabel);

        // Create a Scene with the FlowPane as its root
        Scene scene = new Scene(flowPane, 300, 200);

        // Set the title of the Stage
        primaryStage.setTitle("Multiplication Table Application");

        // Set the Scene for the Stage
        primaryStage.setScene(scene);

        // Show the Stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
	
