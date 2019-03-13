// Heber Cooke 3/11/2019
//Exercise 30_3

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise30_3 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane
		Pane pane = new Pane();

		// Add an image view and add it to pane
		ImageView imageView = new ImageView("image/us.gif");
		pane.getChildren().add(imageView);

		// Create a path transition
		PathTransition pt = new PathTransition(Duration.millis(10000), new Line(100, 200, 100, 0), imageView);
		pt.setCycleCount(5);
		// pt.play(); // Start animation
		Thread thread = new Thread(new Run(pt));	 // creating a new thread object
		thread.start();	 //calling the start method on thread

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 250, 200);
		primaryStage.setTitle("FlagRisingAnimation"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
//Class for  run thread object
	class Run implements Runnable {
		PathTransition pt;

		public Run(PathTransition pt) {
			this.pt = pt;
		}

		@Override	 // run method 
		public void run() {
			pt.play();

		}

	}
}
