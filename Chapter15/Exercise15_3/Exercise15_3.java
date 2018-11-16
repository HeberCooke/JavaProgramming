

// Heber Cooke 		11/13/2018
// Exercise 15_3
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Exercise15_3 extends Application {
	private final double radius = 50;

	@Override
	public void start(Stage stage) {

		BorderPane bp = new BorderPane();
		HBox pane = new HBox(10);
		Button up = new Button("Up");
		Button dn = new Button("Down");
		Button rt = new Button("Right");
		Button lf = new Button("Left");
		pane.setAlignment(Pos.CENTER);
		bp.setBottom(pane);
		pane.getChildren().addAll(up, dn, rt, lf);

		Pane sp = new Pane();
		Circle cir = new Circle(radius);
		cir.setStroke(Color.BLACK);
		cir.setFill(Color.GREY);

		sp.getChildren().add(cir);
		cir.setCenterX(150);
		cir.setCenterY(150);
		// adding the circle to the center of the borderPane
		bp.setCenter(sp);
		// set up button to move up
		up.setOnAction(e -> {
			cir.setCenterX(cir.getCenterX());
			if (cir.getCenterY() - (radius + 4) > sp.getMaxHeight()) {
				cir.setCenterY(cir.getCenterY() - 4);
			}
		});
		// set down button to move down
		dn.setOnAction(e -> {
			cir.setCenterX(cir.getCenterX());
			if (cir.getCenterY() + radius < sp.getHeight()) {
				cir.setCenterY(cir.getCenterY() + 4);
			}
		});
		// set left button to move left
		lf.setOnAction(e -> {
			cir.setCenterY(cir.getCenterY());
			if (cir.getCenterX() - (radius +4) > sp.getMaxWidth()) {
				cir.setCenterX(cir.getCenterX() - 4);
			}
		});
		// set right button to move right
		rt.setOnAction(e -> {
			cir.setCenterY(cir.getCenterY());
			if (cir.getCenterX() +(radius )  < sp.getWidth()) {
				cir.setCenterX(cir.getCenterX() + 4);
			}
		});
		Scene scene = new Scene(bp, 300, 300);
		stage.setTitle("B");
		stage.setScene(scene);
		stage.show();

	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}// end class--------------------------------------------



