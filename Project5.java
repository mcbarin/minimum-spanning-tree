import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Project5 {
	static int numberOfVertexes = 0;
	static int[][] graphMatrix = null;
	static int counter=0; 

	public static void main(String[] args) {
		readMatrix();
		Graph G = new Graph(numberOfVertexes);
		G.updateGraph(graphMatrix);
		
		
		 
		 

		
	}
	
	public static void readMatrix(){
		try{
	    	   BufferedReader rd = new BufferedReader(new FileReader("input1.txt"));
	    	   String line = rd.readLine();
	    	   StringTokenizer st = new StringTokenizer(line);
	    	   numberOfVertexes = Integer.parseInt(st.nextToken());
			   graphMatrix = new int[numberOfVertexes][numberOfVertexes];
			   line = rd.readLine();
	    	   while(line!=null){
	    		   st = new StringTokenizer(line);
	    		    for(int i=0;i<numberOfVertexes;i++){
	    			   graphMatrix[counter][i]= Integer.parseInt(st.nextToken());
	    		   }
	    		    counter++;
	    		   line = rd.readLine();

	    	   }
	    		   
	    	   rd.close();		   
		 }
		 catch(IOException ex){
				System.out.println("There is an error with the file." + ""+ex);
		 }
	}

}
