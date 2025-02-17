import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AnonymousHandlerDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        Text text = new Text(40, 40, "Programming is fun");
        Pane pane = new Pane(text);

        // Create buttons
        Button btUp = new Button("Up");
        Button btDown = new Button("Down");
        Button btLeft = new Button("Left");
        Button btRight = new Button("Right");

        // Add buttons to HBox
        HBox hBox = new HBox(btUp, btDown, btLeft, btRight);
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        // Set up BorderPane
        BorderPane borderPane = new BorderPane(pane);
        borderPane.setBottom(hBox);

        // Button handlers
        btUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                text.setY(text.getY() > 10 ? text.getY() - 5 : 10);
            }
        });

        btDown.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                text.setY(text.getY() < pane.getHeight() ? text.getY() + 5 : pane.getHeight());
            }
        });

        btLeft.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                text.setX(text.getX() > 0 ? text.getX() - 5 : 0);
            }
        });

        btRight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                text.setX(text.getX() < pane.getWidth() - 100 ? text.getX() + 5 : pane.getWidth() - 100);
            }
        });

        // Set up the scene
        Scene scene = new Scene(borderPane, 400, 350);
        primaryStage.setTitle("AnonymousHandlerDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
