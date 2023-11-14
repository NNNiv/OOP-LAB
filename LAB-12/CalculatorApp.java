import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculatorApp extends Application {

    private TextField num1Field, num2Field;
    private Label resultLabel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator App");

        num1Field = new TextField();
        num2Field = new TextField();

        Button computeButton = new Button("Compute");
        computeButton.setOnAction(e -> compute());

        resultLabel = new Label();

        Canvas canvas = new Canvas(150, 150);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.drawImage(new Image("calculator.png"), 0, 0, 150, 150);

        VBox layout = new VBox(10);
        layout.getChildren().addAll(num1Field, num2Field, computeButton, resultLabel, canvas);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void compute() {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());

            double sum = num1 + num2;
            double product = num1 * num2;
            double difference = num1 - num2;
            double quotient = num1 / num2;

            resultLabel.setText("Sum: " + sum + "\nProduct: " + product + "\nDifference: " + difference + "\nQuotient: " + quotient);
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input. Please enter valid numbers.");
        } catch (ArithmeticException e) {
            resultLabel.setText("Error: Division by zero.");
        }
    }
}
