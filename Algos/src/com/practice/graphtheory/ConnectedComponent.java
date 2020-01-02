package com.practice.graphtheory;

public class ConnectedComponent {
	
	public static void main(String[] args) {
		
    Graph g = new Graph(4); 
        
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
        
        
        g.addEdge(4, 5); 
        g.addEdge(4, 6); 
        g.addEdge(5, 6); 
        g.addEdge(6, 4); 
        g.addEdge(6, 7); 
        g.addEdge(7, 7); 
        
        g.addEdge(8, 9); 
        g.addEdge(9, 10); 
        g.addEdge(10, 11); 
        
        
	}

}
