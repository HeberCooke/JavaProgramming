// Heber Cooke 		11/6/2018
//Exercise 14_1



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;;

public class Exercise14_1 extends Application {

	@Override
	public void start(Stage stage) {

		try {
			GridPane pane = new GridPane();
			Image image = new Image(
					"https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/Flag_of_Israel.svg/990px-Flag_of_Israel.svg.png");
			ImageView im1 = new ImageView(image);
			im1.setFitHeight(200);
			im1.setFitWidth(300);
			im1.setImage(image);
			pane.add(im1, 1, 1);
			Image image2 = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Flag_of_the_United_States.svg/800px-Flag_of_the_United_States.svg.png");
			ImageView im2 = new ImageView(image2);
			im2.setFitHeight(200);
			im2.setFitWidth(300);
			im2.setImage(image2);
			pane.add(im2, 1, 0);
			Image image3 = new Image(
					"https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Pirate_Flag.svg/750px-Pirate_Flag.svg.png");
			ImageView im3 = new ImageView(image3);
			im3.setFitHeight(200);
			im3.setFitWidth(300);
			im3.setImage(image3);
			pane.add(im3, 0, 1);
			Image image4 = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Flag_of_the_United_Kingdom.png/800px-Flag_of_the_United_Kingdom.png");
			ImageView im4 = new ImageView(image4);
			im4.setFitHeight(200);
			im4.setFitWidth(300);
			im4.setImage(image4);
			pane.add(im4, 0, 0);

			Scene scene = new Scene(pane);
			stage.setTitle("Exercise14_1");
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // end start-------------------------------

	public static void main(String[] args) {
		Application.launch(args);

	}// end main ------------------------------

}// end class-------------------------------------



