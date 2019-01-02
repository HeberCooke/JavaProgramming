// Heber Cooke 		 12/20/2018
// Exercise 20_9

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise20_9 extends Application {
	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		MultipleBallPane1 ballPane = new MultipleBallPane1();
		ballPane.setStyle("-fx-border-color: yellow");

		Button btnAdd = new Button("+");
		Button btnSubtract = new Button("-");
		HBox hBox = new HBox(10);
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().addAll(btnAdd, btnSubtract);
		// button add or remove a ball
		btnAdd.setOnAction(e -> {
			ballPane.add();
		});
		btnSubtract.setOnAction(e -> {
			ballPane.subtract();
		});
		ScrollBar sbSpeed = new ScrollBar();
		sbSpeed.setMax(20);
		sbSpeed.setValue(10);
		ballPane.rateProperty().bind(sbSpeed.valueProperty());

		BorderPane pane = new BorderPane();
		pane.setCenter(ballPane);
		pane.setTop(sbSpeed);
		pane.setBottom(hBox);

		Scene scene = new Scene(pane, 350, 250);
		primaryStage.setTitle("MultipleBallBOunce");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}

class MultipleBallPane1 extends Pane {
	private Timeline animation;

	public MultipleBallPane1() {
		animation = new Timeline(new KeyFrame(Duration.millis(50), e -> moveBall()));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
	}

	public void add() {
		Color color = new Color(Math.random(), Math.random(), Math.random(), 0.5);
		getChildren().add(new Ball1(30, 30, Math.random() * 16 + 5, color));
	}

	public void subtract() {

		if (getChildren().size() > 0) {
			Ball1 ball2 = (Ball1) (getChildren().get(0));
			for (Node node : getChildren())
				if (((Ball1) node).getRadius() > ball2.getRadius())
					ball2 = (Ball1) node;
			getChildren().remove(ball2);
		} // for
	}// end subtract

	public void play() {
		animation.play();
	}

	public void pause() {
		animation.pause();
	}

	public void increaseSpeed() {
		animation.setRate(animation.getRate() + 0.1);

	}

	public void decreaseSpeed() {
		animation.setRate(animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
	}

	public DoubleProperty rateProperty() {
		return animation.rateProperty();
	}

	protected void moveBall() {
		for (Node node : this.getChildren()) {
			Ball1 ball = (Ball1) node;
			if (ball.getCenterX() < ball.getRadius() || ball.getCenterX() > getWidth() - ball.getRadius()) {
				ball.dx *= -1;
			}
			if (ball.getCenterY() < ball.getRadius() || ball.getCenterY() > getHeight() - ball.getRadius()) {
				ball.dy *= -1;
			}

			ball.setCenterX(ball.dx + ball.getCenterX());
			ball.setCenterY(ball.dy + ball.getCenterY());
		}

	}
}

class Ball1 extends Circle implements Comparable<Ball1> { // comparable
	public double dx = 1, dy = 1;

	Ball1(double x, double y, double radius, Color color) {
		super(x, y, radius);
		setFill(color);
	}

	@Override
	public int compareTo(Ball1 o) {
		if (this.getRadius() - o.getRadius() < 0) {
			return -1;
		} else if (this.getRadius() - o.getRadius() == 0) {
			return 0;
		} else
			return 1;
	}

}


