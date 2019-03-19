import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercise31_09Server extends Application {
  private TextArea taServer = new TextArea();
  private TextArea taClient = new TextArea();
 
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    taServer.setWrapText(true);
    taClient.setWrapText(true);
    //taClient.setDisable(true);

    BorderPane pane1 = new BorderPane();
    pane1.setTop(new Label("History"));
    pane1.setCenter(new ScrollPane(taServer));
    BorderPane pane2 = new BorderPane();
    pane2.setTop(new Label("New Message"));
    pane2.setCenter(new ScrollPane(taClient));
    
    VBox vBox = new VBox(5);
    vBox.getChildren().addAll(pane1, pane2);

    // Create a scene and place it in the stage
    Scene scene = new Scene(vBox, 250, 400);
    primaryStage.setTitle("Exercise31_09Server"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage

    // To complete later
    new Thread(() ->  {
    	try {
    		ServerSocket serverSocket = new ServerSocket(8000);
    		Socket socket =serverSocket.accept();
    		
    		DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());
    		DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
    		
    		Platform.runLater(() -> taServer.appendText("Server started "+ new Date() + "\n"));
    		
    		while(true) {
    			
    			taClient.setOnKeyPressed(new EventHandler<KeyEvent>() {
    				@Override //handle event for enter key to send message
    				public void handle(KeyEvent ke) {
    					if (ke.getCode().equals(KeyCode.ENTER)) {
    						try {
    							//new message sending to the client
    							String messageOut = taClient.getText().trim();
    							outputToClient.writeUTF(messageOut);
    							outputToClient.flush();
    							//displaying message to history (taServer)  text area 
    							taServer.appendText("\nServer--> "+messageOut);
    							//clearing taClient text area 
    							taClient.clear();
    						}
    						catch(IOException ex) {
    							ex.printStackTrace();
    						}
    						
    					}
					}
    				
    			});
    			String messageIn = inputFromClient.readUTF();
    			taServer.appendText("\nClient --> "+ messageIn);
    		}
    		
    		
    	}
    	catch(IOException ex) {
    		ex.printStackTrace();
    	}
    }).start();
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
