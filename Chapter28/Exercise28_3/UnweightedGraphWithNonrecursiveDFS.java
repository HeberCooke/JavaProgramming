import java.util.*;

public class UnweightedGraphWithNonrecursiveDFS<V> extends UnweightedGraph<V> {
	public static void main(String[] args) {

		UnweightedGraphWithNonrecursiveDFS<String> g = new UnweightedGraphWithNonrecursiveDFS<>();
		g.addVertex("Hello");
		g.addVertex("World");
		g.addVertex("Programming");
		g.addVertex("is");
		g.addVertex("fun");
		g.addVertex("!!!");

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(2, 4);
		g.addEdge(4, 5);
System.out.println("----Test graph 1 --------------");
		UnweightedGraphWithNonrecursiveDFS<String>.Tree gra = g.dfs(g.getIndex("Hello"));
		List<Integer> s = gra.getSearchOrder();
		System.out.println("Search order from --> Hello");
		System.out.println(s);

		System.out.println();
		gra.printPath(g.getIndex("fun"));
		System.out.println();
		System.out.println();

		// -------------------------------------------------------------------------------------------------------------------------
System.out.println("------------Test graph2 --------------");
		String[] vertices = { "Seattle", "San Francisco", "Los Angeles", "Denver", "Kansas City", "Chicago", "Boston",
				"New York", "Atlanta", "Miami", "Dallas", "Houston" };

		// Edge array for graph
		int[][] edges = { { 0, 1 }, { 0, 3 }, { 0, 5 }, { 1, 0 }, { 1, 2 }, { 1, 3 }, { 2, 1 }, { 2, 3 }, { 2, 4 },
				{ 2, 10 }, { 3, 0 }, { 3, 1 }, { 3, 2 }, { 3, 4 }, { 3, 5 }, { 4, 2 }, { 4, 3 }, { 4, 5 }, { 4, 7 },
				{ 4, 8 }, { 4, 10 }, { 5, 0 }, { 5, 3 }, { 5, 4 }, { 5, 6 }, { 5, 7 }, { 6, 5 }, { 6, 7 }, { 7, 4 },
				{ 7, 5 }, { 7, 6 }, { 7, 8 }, { 8, 4 }, { 8, 7 }, { 8, 9 }, { 8, 10 }, { 8, 11 }, { 9, 8 }, { 9, 11 },
				{ 10, 2 }, { 10, 4 }, { 10, 8 }, { 10, 11 }, { 11, 8 }, { 11, 9 }, { 11, 10 } };

		Graph<String> graph = new UnweightedGraphWithNonrecursiveDFS<>(vertices, edges);

		AbstractGraph<String>.Tree dfs = graph.dfs(graph.getIndex("Chicago"));
		java.util.List<Integer> searchOrders = dfs.getSearchOrder();
		System.out.println(dfs.getNumberOfVerticesFound() + " vertices are searched in this DFS order : ");
		for (int i = 0; i < searchOrders.size(); i++)
			System.out.print(graph.getVertex(searchOrders.get(i)) + " ");
		System.out.println();
		for (int i = 0; i < searchOrders.size(); i++)
			if (dfs.getParent(i) != -1)
				System.out.println("Parent of  " + graph.getVertex(i) + " is " + graph.getVertex(dfs.getParent(i)));

	}// end main ------------------------------------------------------------

	// Constructors
	public UnweightedGraphWithNonrecursiveDFS() {
		// Default
	}

	public UnweightedGraphWithNonrecursiveDFS(V[] vertices, int[][] edges) {
		super(vertices, edges);
	}

	@Override // Exercise 28_3 DFS without recursion
	public Tree dfs(int v) {

		List<Integer> searchOrder = new ArrayList<>();
		// Creating integer array to store checked bread crumb vertex index
		int[] parent = new int[vertices.size()];
		for (int i = 0; i < vertices.size(); i++) {
			parent[i] = -1; // setting array values to -1
		}
		// is visited array to mark  visited vertex
		boolean[] isVisited = new boolean[vertices.size()];

		Stack<Integer> stack = new Stack<>();
	//	LinkedList<Integer> stack = new LinkedList<>();
		stack.push(v); // adding the first visited vertex to the stack

		while (!stack.isEmpty()) {
			int tmp = stack.pop(); // taking the current vertex off the stack
			if (!isVisited[tmp]) {
				searchOrder.add(tmp); // adding tmp vertex to the list of visited vertices
				isVisited[tmp] = true; // marking the visited vertex

			}
			for (int e : getNeighbors(tmp)) { // reversing the tree to find unvisited vertices
				if (!isVisited[e]) {
					parent[e] = tmp;
					stack.push(e);
				}
			}

		}
		return new Tree(v, parent, searchOrder);
	}

}
