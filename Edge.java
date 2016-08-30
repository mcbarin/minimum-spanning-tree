public class Edge {
	boolean isDiscovered = false; // false is undiscovered. true is discovered
	int distance=999999;
	Node a;
	Node b;
	public Edge(Node graph,Node graph2,int distance){
		this.a=graph;
		this.b=graph2;
		this.distance=distance;
	}

	public void visit(){
		this.isDiscovered=true;
	}
	public void unvisit(){
		this.isDiscovered=false;
	}
	public void setDistance(int distance){
		this.distance=distance;
	}
	public boolean isDiscovered(){
		return isDiscovered;
	}
	public int getDistance(){
		return distance;
	}

}

