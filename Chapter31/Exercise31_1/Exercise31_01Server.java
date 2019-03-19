//Heber Cooke  		3/17/2019
//Exercise 31_1


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class Exercise31_01Server extends Application {
	// Text area for displaying contents
	private TextArea ta = new TextArea();

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		ta.setWrapText(true);

		// Create a scene and place it in the stage
		Scene scene = new Scene(new ScrollPane(ta), 400, 200);
		primaryStage.setTitle("Exercise31_01Server"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
		new Thread(()-> {
		try {
			//Create a server socket 
			ServerSocket serverSocket = new ServerSocket(8000);
			
			//display  information  to server
			Platform.runLater(()->  ta.appendText("Server started on "+ new Date()+ "\n"));
			//Listen for a connection request 
			Socket socket = serverSocket.accept();
			
			//Create data input and output streams 
			DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
			DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());
			
			while(true ) {
				//Receive information from client 
				double annualIntrestRate = inputFromClient.readDouble();
				int numberOfYears = inputFromClient.readInt();
				double loanAmount = inputFromClient.readDouble();
				
				//Compute monthly payment and total payment 
				Loan loan = new Loan(annualIntrestRate,numberOfYears,loanAmount);
				outputToClient.writeDouble(loan.getMonthlyPayment());
				outputToClient.writeDouble(loan.getTotalPayment());
				
				//Display info on server text area 
				Platform.runLater( ()->{
					ta.appendText("Annual Intrestrate "+ annualIntrestRate+ "\n");
					ta.appendText("Number of Years "+ numberOfYears+ "\n");
					ta.appendText("Loan amount $"+ loanAmount+"\n");
					ta.appendText("Monthly payment $"+loan.getMonthlyPayment()+ "\n");
					ta.appendText("Total payment $"+loan.getTotalPayment()+"\n");
					
				});
			}
			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		}).start();
	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support. Not
	 * needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
