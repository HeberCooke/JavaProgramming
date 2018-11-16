


//Heber Cooke 		11/7/2018
//Exercise 14_15

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.text.*;

public class Exercise15_23 extends Application {
	@Override
	public void start(Stage stage) {

		Pane pane = new Pane();
		

		pane.widthProperty().addListener(ov -> {
			makeP(pane);

		});
		pane.heightProperty().addListener(ov -> {
			makeP(pane);
		});
		
		Scene scene = new Scene(pane, 200, 200);
		stage.setTitle("Exercise14_15");
		stage.setScene(scene);
		stage.show();

	}
	
	
	


	
	public void makeP(Pane pane) {
		pane.getChildren().clear();
	//	double x = 5.7;
	//	double y = 1.75;

		Pane p2 = new Pane();
		Text text = new Text(35  ,114 ,"STOP");
		double size =50;
		text.setFont(Font.font("Times New Roman",FontWeight.BOLD,size));
		text.setFill(Color.WHITE);
		p2.getChildren().add(text);
		// set text to center in  the pane
		text.setX(pane.getWidth()/2 -66);
		text.setY(pane.getHeight()/2 +12 );
		Polygon polygon = new Polygon();
		pane.getChildren().addAll(polygon,text);
		polygon.setRotate(22.5);
		polygon.setFill(Color.RED);
		
		ObservableList<Double> list = polygon.getPoints();
		double width = pane.getWidth();
		double height = pane.getHeight();
		double centerX = width / 2;
		double centerY = height / 2;
		double radius = Math.min(width, height) * 0.4;

		for (int i = 0; i < 8; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 8));
		}

	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}



