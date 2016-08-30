import java.util.PriorityQueue;


public class MST {
	public Edge[] tree = new Edge[20];
	Graph G;
	public MST(Graph G){
		this.G=G;
	}
	PriorityQueue<Edge> queue = new PriorityQueue<Edge>();
}
