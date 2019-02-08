
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class BTView2 extends Pane {	

	private  BST<Integer> tree = new BST<>();
	private double radius = 15; //tree node radius 
	private double vGap = 50; //gap between two levels in the tree
	
	BTView2(BST<Integer> tree){
		this.tree = tree;
		setStatus("Tree is empty ");
	}
	
	public void setStatus(String msg) {
		getChildren().add(new Text(20,20,msg));
	}
	
	public void displayTree() {
		this.getChildren().clear(); //clear the pane
		if(tree.getRoot() != null) {
			displayTree(tree.getRoot(), vGap, getHeight() /2 , getHeight() / 4);
		
		}  
	}
	
	//Display a subtree rooted at position x , y
	private void displayTree(BST.TreeNode<Integer> root,double x , double y , double hGap) {
		if(root.left != null) {
			//draw a line to the left node
			getChildren().add(new Line(x + vGap , y  + hGap , x,y ));
			//draw a left tree recursively
			displayTree(root.left , x + vGap , y + hGap , hGap /2 );
		}
		if(root.right != null) {
			//draw a line to the right node
			getChildren().add(new Line (x + vGap, y - hGap , x,y));
			//Draw the right subtree recursively
			displayTree(root.right,x + vGap, y - hGap, hGap /2);
		}
		
		//Display Node
		Circle circle = new Circle(x,y,radius);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		
		getChildren().addAll(circle,new Text(x - 4, y + 4, root.element+ ""));
		
		
	}
	
}

