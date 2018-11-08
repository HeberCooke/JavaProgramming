
// Heber Cooke 		11/7/2018

//Exercise 14_13

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;

public class Exercise14_13 extends Application {
	@Override
	public void start(Stage stage) {

		Pane pane = new Pane();

		Arc arc1 = new Arc(150, 150, 100, 100, 0, 72);

		arc1.setFill(Color.RED);
		arc1.setType(ArcType.ROUND);
		pane.getChildren().add(new Text(240, 80, "Projects"));
		pane.getChildren().add(arc1);

		Arc arc2 = new Arc(150, 150, 100, 100, 72, 36);
		arc2.setFill(Color.BLUE);
		arc2.setType(ArcType.ROUND);
		pane.getChildren().add(new Text(125, 40, "Quizzes"));
		pane.getChildren().add(arc2);

		Arc arc3 = new Arc(150, 150, 100, 100, 108, 108);
		arc3.setFill(Color.GREEN);
		arc3.setType(ArcType.ROUND);
		pane.getChildren().add(new Text(5, 100, "Mid Term"));
		pane.getChildren().add(arc3);

		Arc arc4 = new Arc(150, 150, 100, 100, 0, -144);
		arc4.setFill(Color.ORANGE);
		arc4.setType(ArcType.ROUND);
		pane.getChildren().add(new Text(200, 250, "Final Exam"));
		pane.getChildren().add(arc4);

		Scene scene = new Scene(pane, 300, 300);
		stage.setTitle("Exercise14_13");
		stage.setScene(scene);
		stage.show();

	}// end start-----------

	public static void main(String[] args) {
		Application.launch(args);
	}
}


