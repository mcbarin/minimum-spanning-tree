
public class Graph {
int numberOfVertexes=0;
Node[] graph = null;
	
public Graph(int numberOfVertexes){
	this.numberOfVertexes=numberOfVertexes;
	initializeGraph();
}
public void initializeGraph(){
	graph = new Node[numberOfVertexes];
	for(int i=0;i<numberOfVertexes;i++){
		graph[i] = new Node(i);
		graph[i].setNodeNumber(i);
	}
}
public void updateGraph(int[][] matrix){
	for(int i=0;i<numberOfVertexes;i++){
		for(int j=0;j<numberOfVertexes;j++){
			if(i!=j){
				Edge e = new Edge(graph[i],graph[j],matrix[i][j]);
				graph[i].addEdge(e);
			}
		}
	}
}

}