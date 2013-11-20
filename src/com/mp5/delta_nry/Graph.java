package com.mp5.delta_nry;

/**
 * 
 * @author nathan
 *
 * TODO: finish Javadoc
 *
 */

public class Graph {
	// Constructor operations
	public void createGraph()
	// post: creates an empty graph
	public void addNode(newItem)
	// post: adds newItem in a graph. No change if newItem already exists.
	public void addEdge(node1, node2)
	// post: adds an edge between two existing nodes (Node1 and Node2)
	
	// Predicate operations to test graph
	public boolean isEmpty()
	// post: determines whether a graph is empty
	public void isLink(node1, node2)
	// post: returns true if edge (Node1, Node2) is present in the graph
	
	// Selector operations to select items of a queue
	public void deleteNode(node1)
	// post: remove a node and any edges between this node and other nodes.
	public void deleteEdge(node1, node2)
	// post: delete the edge between the two given nodes Node1, Node2.
}
