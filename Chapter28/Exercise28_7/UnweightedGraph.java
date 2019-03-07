import java.util.List;

public class UnweightedGraph <V> extends AbstractGraph<V>{

	//Construct a empty graph 
	public UnweightedGraph() {
		
	}
	
	//Construct a graph from vertices and edges stored on arrays 
	public UnweightedGraph(V [] vertices, int [] [] edges) {
		super(vertices,edges);
	}
	
	//Construct a graph from vertices and edges stored in a list
	public UnweightedGraph(List<V> vertices,List<Edge> edges) {
		super(vertices,edges);
	}
	
	//Construct a graph for integer vertices  and edge list
	public UnweightedGraph(List<Edge>edges,int numberOfVertices) {
		super(edges,numberOfVertices);
	}
	
	//Construct a graph from integer vertices and edge array 
	public UnweightedGraph(int [] [] edges,int numberOfVertices) {
		super(edges,numberOfVertices);
	}
}
