// Heber Cooke 		11/7/2018
// Exercise 14_15

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import java.util.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.geometry.Insets;

public class Exercise14_15 extends Application{
	@Override
	public void start(Stage stage){
		
		Pane pane = new Pane();
		Polygon polygon = new Polygon();
		Text text = new Text(35,114,"STOP");
		text.setFont(Font.font("Times New Roman",FontWeight.BOLD,50));
		text.setFill(Color.WHITE);
	
		pane.getChildren().add(polygon);
		polygon.setRotate(22);
		pane.getChildren().add(text);
			


		
		
		
		polygon.setFill(Color.RED);
		
		ObservableList<Double> list = polygon.getPoints();
		
		final double WIDTH = 200;
		final double HEIGHT = 200;
		double centerX = WIDTH / 2;
		double centerY = HEIGHT / 2;
		double radius = Math.min(WIDTH,HEIGHT)* 0.4;
		
		for (int i = 0; i < 8; i ++ ){
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8 ));
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 8 ));
		}
		
		
		Scene scene = new Scene(pane,WIDTH,HEIGHT);
		stage.setTitle("Exercise14_15");
		stage.setScene(scene);
		stage.show();
		

	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}

