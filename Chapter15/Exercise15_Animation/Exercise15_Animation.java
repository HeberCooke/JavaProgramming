// Heber Cooke 		11/16/2018
//Exercise15 Animation

import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise15_Animation extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Pane pane = new Pane();
		
		// pentagon
		Polygon pentagon = new Polygon();
		ObservableList<Double> list = pentagon.getPoints();
		double centerX = 200;
		double centerY = 200;
		double radius = 100;
		
		for (int i = 0; i < 5; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 5));
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 5));
		}
		pentagon.setFill(Color.LAVENDERBLUSH);
		pentagon.setStroke(Color.PURPLE);
		pentagon.setRotate(55);

		// rectangle
		Rectangle rectangle = new Rectangle(50, 30);
		rectangle.setFill(Color.PURPLE);
		FadeTransition ft = new FadeTransition(Duration.millis(3000), rectangle);
		ft.setToValue(0.1);
		ft.setFromValue(1.0);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		ft.play();
		// set rectangle to travel the pentagon
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.seconds(3));
		pt.setPath(pentagon);
		pt.setNode(rectangle);
		pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.play();
		
		// add pause to pentagon for rectangle travel on mouse click
		pentagon.setOnMouseClicked(e ->{
			if (pt.getStatus() == PathTransition.Status.PAUSED) {
				pt.play();
			}
			else {
				pt.pause();
			}
		});
		// add pause to pause color transition on the rectangle
		rectangle.setOnMouseClicked(e ->{
			if (ft.getStatus() == PathTransition.Status.PAUSED) {
				ft.play();
			}
			else {
				ft.pause();
			}
		});
		// add nodes to pane 
		pane.getChildren().add(pentagon);
		pane.getChildren().add(rectangle);

		Scene scene = new Scene(pane, 400, 400);
		stage.setScene(scene);
		stage.setTitle("Exercise 15 Animation");
		stage.show();

	}
}
