// Heber Cooke 		11/8/2018
// Exercise 14_28

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import java.util.Random;
public class DisplayClock extends Application {

	@Override
	public void start(Stage stage) {
		ClockPane clock = new ClockPane();
		// sets random value for hour and minute
		int hour = (int)(Math.random()* 11 + 0) ;
		int minute = (int)(Math.random()* 30+ 0) ;
		int second = (int)(Math.random()* 60 + 0) ;
		// sets properties 
		clock.setHourHandVisable(true);
		clock.setMiniuteHandVisable(true);
		clock.setSecondHandVisable(false);
		clock.setHour(hour);
		clock.setMinute(minute);
		clock.setSecond(second);
		
		
		String timeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
		Label lblCurrentTime = new Label(timeString);

		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		pane.setBottom(lblCurrentTime);
		BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

		Scene scene = new Scene(pane, 250, 250);
		stage.setTitle("Display Clock");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}


