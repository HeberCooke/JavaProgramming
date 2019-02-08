
// the clear  button not on the book ,  resets the application  

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class BSTAnimation extends Application {

	/* commented out for exercise 25_11 

		public static void main(String[] args) {
		Application.launch(args);
	}

	*/
	@Override
	public void start(Stage primaryStage) throws Exception {
		BST<Integer> tree = new BST<>();

		BorderPane pane = new BorderPane();
		BTView2 view = new BTView2(tree);
		pane.setCenter(view);

		TextField tfKey = new TextField();
		tfKey.setPrefColumnCount(3);
		tfKey.setAlignment(Pos.BASELINE_CENTER);
		Button btnInsert = new Button("Insert");
		Button btnDelete = new Button("Delete");
		Button clear = new Button("Clear");

		HBox hbox = new HBox(5);
		hbox.getChildren().addAll(new Label("Enter a key"), tfKey, btnInsert, btnDelete, clear);
		hbox.setAlignment(Pos.CENTER);
		pane.setBottom(hbox);

		btnInsert.setOnAction(e -> {
			int key = Integer.parseInt(tfKey.getText());
			if (tree.search(key)) {
				view.displayTree();
				view.setStatus(key + " is already in the tree");
			} else {
				tree.insert(key);

				view.displayTree();
				view.setStatus(key + " is inserted in the tree");
			}

		});

		btnDelete.setOnAction(e -> {
			int key = Integer.parseInt(tfKey.getText());
			if (!tree.search(key)) { // key not in the tree
				view.displayTree();
				view.setStatus(key + " is not in  the tree");
			} else {
				tree.delete(key); // delete a key
				view.displayTree();
				view.setStatus(key + " is deleted from the tree");
			}
		});

		clear.setOnAction(e -> { // clear method and button not in the book
			tree.clear();
			view.displayTree();
		});
		// create a scene and a place the pane in the stage
		Scene scene = new Scene(pane, 450, 250);
		primaryStage.setTitle("BST animation");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
