// Heber Cooke 		11/22/2018
//Excercise 16_1



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Exercise16_1 extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Text text = new Text(60, 75, "Programming is Fun!");
		text.setFont(Font.font("Franklin Gothic", 20));
		// left and right buttons
		HBox paneForButtons = new HBox(20);
		Button btnR = new Button("Right");
		Button btnL = new Button("Left");
		paneForButtons.getChildren().addAll(btnR, btnL);
		paneForButtons.setAlignment(Pos.CENTER);
		paneForButtons.setStyle("-fx-border-color:black");
		// main pane
		BorderPane borderPane = new BorderPane();
		borderPane.setBottom(paneForButtons);
		// center pane for text
		Pane paneForText = new Pane();
		paneForText.getChildren().add(text);
		borderPane.setCenter(paneForText);

		btnL.setOnAction(e -> text.setX(text.getX() - 10));
		btnR.setOnAction(e -> text.setX(text.getX() + 10));

		HBox rButtons = new HBox(20);
		RadioButton redB = new RadioButton("Red");
		RadioButton greenB = new RadioButton("Green");
		RadioButton yellowB = new RadioButton("Yellow");
		RadioButton blackB = new RadioButton("Black");
		RadioButton blueB = new RadioButton("Blue");
		rButtons.getChildren().addAll(redB, greenB, yellowB, blackB, blueB);
		rButtons.setPadding(new Insets(5, 5, 5, 5));
		rButtons.setAlignment(Pos.CENTER);
		rButtons.setStyle("-fx-border-color: black");
		rButtons.setStyle("-fx-borde-width: 2px;-fx-border-color:black");

		ToggleGroup group = new ToggleGroup();
		redB.setToggleGroup(group);
		greenB.setToggleGroup(group);
		yellowB.setToggleGroup(group);
		blackB.setToggleGroup(group);
		blueB.setToggleGroup(group);

		// Button actions
		redB.setOnAction(e -> {
			if (redB.isSelected()) {
				text.setFill(Color.RED);
			}
		});
		greenB.setOnAction(e -> {
			if (greenB.isSelected()) {
				text.setFill(Color.GREEN);
			}
		});
		yellowB.setOnAction(e -> {
			if (yellowB.isSelected()) {
				text.setFill(Color.YELLOW);
			}
		});
		blackB.setOnAction(e -> {
			if (blackB.isSelected()) {
				text.setFill(Color.BLACK);
			}
		});
		blueB.setOnAction(e -> {
			if (blueB.isSelected()) {
				text.setFill(Color.BLUE);
			}
		});

		borderPane.setTop(rButtons);
		Scene scene = new Scene(borderPane, 400, 200);
		primaryStage.setTitle("Exercise16_1");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}


