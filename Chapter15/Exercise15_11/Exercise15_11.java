
//Heber Cooke 		11/13/2018
//Exercise 15 -11

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise15_11 extends Application {
	@Override
	public void start(Stage stage) throws Exception {

		Pane pane = new Pane();
		Circle cir = new Circle(20, 20, 20);
		cir.setFill(Color.GREY);
		cir.setCenterX(50);
		cir.setCenterY(50);
		pane.getChildren().add(cir);
		cir.setOnKeyPressed(e -> {
			switch (e.getCode()) {
			case DOWN:
				cir.setCenterY(cir.getCenterY() + 10);
				break;
			case UP:
				cir.setCenterY(cir.getCenterY() - 10);
				break;
			case LEFT:
				cir.setCenterX(cir.getCenterX() - 10);
				break;
			case RIGHT:
				cir.setCenterX(cir.getCenterX() + 10);
				break;
			}
		});

		Scene scene = new Scene(pane, 100, 100);
		stage.setTitle("Exercise15_11");
		stage.setScene(scene);
		stage.show();
		cir.requestFocus();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}



