import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MessageScrollApp extends Application {

    private Text messageText;
    private Timeline animation;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Message Scroller");

        messageText = new Text("Hello, World!");
        messageText.setFont(new Font(20));

        ToggleGroup directionGroup = new ToggleGroup();
        RadioButton leftToRightRadioButton = new RadioButton("Left to Right");
        RadioButton rightToLeftRadioButton = new RadioButton("Right to Left");

        leftToRightRadioButton.setToggleGroup(directionGroup);
        rightToLeftRadioButton.setToggleGroup(directionGroup);
        leftToRightRadioButton.setSelected(true);

        HBox radioBox = new HBox(10, leftToRightRadioButton, rightToLeftRadioButton);

        StackPane layout = new StackPane();
        layout.getChildren().addAll(messageText, radioBox);

        Scene scene = new Scene(layout, 400, 100);
        primaryStage.setScene(scene);

        setupAnimation();

        directionGroup.selectedToggleProperty().addListener((obs, oldToggle, newToggle) -> {
            if (newToggle == leftToRightRadioButton) {
                startAnimation(true);
            } else if (newToggle == rightToLeftRadioButton) {
                startAnimation(false);
            }
        });

        primaryStage.show();
    }

    private void setupAnimation() {
        Duration duration = Duration.millis(10);
        KeyFrame keyFrame = new KeyFrame(duration, e -> moveMessage());
        animation = new Timeline(keyFrame);
        animation.setCycleCount(Animation.INDEFINITE);
    }

    private void moveMessage() {
        double layoutWidth = messageText.getParent().getLayoutBounds().getWidth();
        double textWidth = messageText.getLayoutBounds().getWidth();
        double currentX = messageText.getTranslateX();

        if (currentX + textWidth > layoutWidth) {
            messageText.setTranslateX(-textWidth);
        } else {
            messageText.setTranslateX(currentX + 1);
        }
    }

    private void startAnimation(boolean leftToRight) {
        if (animation != null) {
            animation.stop();
        }

        if (leftToRight) {
            animation.setRate(1);
        } else {
            animation.setRate(-1);
        }

        animation.play();
    }
}
