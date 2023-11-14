import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ResumeApp extends Application {

    private TextField nameField, emailField, phoneField;
    private CheckBox englishCheckBox, hindiCheckBox, kannadaCheckBox, tamilCheckBox;
    private Label resultLabel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Resume Creator");

        nameField = new TextField();
        emailField = new TextField();
        phoneField = new TextField();

        englishCheckBox = new CheckBox("English");
        hindiCheckBox = new CheckBox("Hindi");
        kannadaCheckBox = new CheckBox("Kannada");
        tamilCheckBox = new CheckBox("Tamil");

        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> generateResume());

        resultLabel = new Label();

        Canvas canvas = new Canvas(150, 150);

        VBox layout = new VBox(10);
        layout.getChildren().addAll(
                new Label("Name:"), nameField,
                new Label("Email:"), emailField,
                new Label("Phone:"), phoneField,
                new Label("Languages:"), englishCheckBox, hindiCheckBox, kannadaCheckBox, tamilCheckBox,
                submitButton, resultLabel, canvas
        );

        Scene scene = new Scene(layout, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void generateResume() {
        StringBuilder resume = new StringBuilder();
        resume.append("Name: ").append(nameField.getText()).append("\n");
        resume.append("Email: ").append(emailField.getText()).append("\n");
        resume.append("Phone: ").append(phoneField.getText()).append("\n");
        resume.append("Languages: ");

        if (englishCheckBox.isSelected()) resume.append("English, ");
        if (hindiCheckBox.isSelected()) resume.append("Hindi, ");
        if (kannadaCheckBox.isSelected()) resume.append("Kannada, ");
        if (tamilCheckBox.isSelected()) resume.append("Tamil");

        // Remove trailing comma and space
        if (resume.toString().endsWith(", ")) {
            resume.setLength(resume.length() - 2);
        }

        resultLabel.setText(resume.toString());
    }
}
