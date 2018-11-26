// Heber Cooke 		11/26/2018
// Exercise16_21


import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.util.Duration;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.Media;

public class Exercise16_21 extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	TextField textField = new TextField("0");
	Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000), e -> {
		int temp = Integer.parseInt(textField.getText()) - 1;
		textField.setText(temp + "");
		if (temp == 0) {
			stopPlay();

		}
	}));

	Media media = new Media("https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3");
	MediaPlayer mediaPlayer = new MediaPlayer(media);

	public void stopPlay() {
		animation.stop();
		mediaPlayer.play();
	}

	@Override
	public void start(Stage stage) {

		BorderPane paneForTextField = new BorderPane();
		paneForTextField.setStyle("-fx-border-color: black");
		textField.setEditable(true);
		textField.setFont(Font.font("Times", 50));
		textField.setAlignment(Pos.CENTER);

		mediaPlayer.setCycleCount(Timeline.INDEFINITE);

		animation.setCycleCount(Timeline.INDEFINITE);
		textField.setOnAction(ov -> {
			animation.play();
		});

		Scene scene = new Scene(textField, 200, 150);
		stage.setTitle("Exercise16_21");
		stage.setScene(scene);
		stage.show();
	}

}


