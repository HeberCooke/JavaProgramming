// Heber Cooke 		11/24/2018
// Exercise16_15

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercise16_15 extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		BorderPane pane = new BorderPane();
		BorderPane pane2 = new BorderPane();
		HBox box2 = new HBox();
		HBox box3 = new HBox();
		ComboBox<String> box = new ComboBox<>();

		box.getItems().addAll("Bottom", "Center", "Graphic Only", "Left", "Right", "Text Only", "Top");
		TextField textField = new TextField();
		box3.getChildren().addAll(new Label("Graphic Text Gap"), textField);
		box2.getChildren().addAll(new Label("Content Display"), box);
		pane2.setLeft(box2);
		pane2.setRight(box3);

		Image image = new Image("http://www.pngall.com/wp-content/uploads/2016/04/Grape-PNG-File.png");
		ImageView imV = new ImageView(image);
		imV.setFitHeight(120);
		imV.setFitWidth(120);

		Label label = new Label("Grapes", imV);
		pane.setCenter(label);

		textField.setOnAction(e -> {
			double n = new Double(textField.getText());
			label.setGraphicTextGap(n);
		});

		box.setOnAction(e -> {
			if (box.getValue() == "Bottom") {
				label.setContentDisplay(ContentDisplay.BOTTOM);
			} else if (box.getValue() == "Center") {

				label.setContentDisplay(ContentDisplay.CENTER);
			} else if (box.getValue() == "Graphic only") {

				label.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
				
				
			} else if (box.getValue() == "Left") {

				label.setContentDisplay(ContentDisplay.LEFT);
			} else if (box.getValue() == "Right") {

				label.setContentDisplay(ContentDisplay.RIGHT);
			} else if (box.getValue() == "Text only") {

				label.setContentDisplay(ContentDisplay.TEXT_ONLY);
			} else if (box.getValue() == "Top") {

				label.setContentDisplay(ContentDisplay.TOP);
			}
		});

		pane.getChildren().add(pane2);
		Scene scene = new Scene(pane, 500, 300);
		primaryStage.setTitle("Exercise16_15");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}


