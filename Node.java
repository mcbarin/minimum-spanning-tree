public class Node{
	int key = 9999;
	int nodeNumber;
	Node parent = null;
	int numberOfEdges=0;
	Edge[] edges = new Edge[20];
	
	//constructor for Node class
	public Node(){
		
	}
	public void addEdge(Edge e){
		edges[numberOfEdges]=e;
		numberOfEdges++;
	}
	public void setNodeNumber(int i){
		nodeNumber=i;
	}
	public int getNodeNumber(){
		return nodeNumber;
	}
	boolean isDiscovered = false; // false is undiscovered. true is discovered
	public Node(int nodeNumber){
		this.nodeNumber=nodeNumber;
	}
	public void setParent(Node parent){
		this.parent=parent;
	}
	public Node getParent(){
		return parent;
	}
	public void visit(){
		this.isDiscovered=true;
	}
	public void unvisit(){
		this.isDiscovered=false;
	}
	public boolean isDiscovered(){
		return isDiscovered;
	}
}