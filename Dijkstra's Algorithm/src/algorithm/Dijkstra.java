package algorithm;
import java.util.ArrayList;
import java.util.Arrays;

public class Dijkstra {
	
	public static void main(String args[]) {
		
		//Using the given data from the cited Wikepedia page, I will demonstrate the workability of Dijkstra's Algorithm
		Graph g = new Graph();
		
		//Initialize graph with the given data
		g.useGivenData();
		
		//Use the 1st node
		Node n = new Node(1);
		
		//Create an instance of Dijkstra's Algorithm, and set it with the given data
		Dijkstra d = new Dijkstra(g, n);
		
		//Prints the solution of Previous Nodes
		ArrayList<Node> solution = d.solve();
		pln("\nSOLUTION (Previous Nodes): "+ solution);
		
	}
	
	//Necessary class varaibles initializing the given graph, node, and the three return arraylists
	private Graph graph;
	private Node node;
	private ArrayList<Boolean> truthValues;
	private ArrayList<Integer> shortestD;
	private ArrayList<Node> previousNodes;
	
	//Variables to help shorten the code
	private int inf = Integer.MAX_VALUE;
	private int size;
	
	//Constructor
	public Dijkstra(Graph inputgraph, Node inputnode) {
		graph = inputgraph;
		node = inputnode;
		init();
	}
	
	//Initializes the three arrays and sets all other class variables needed
	public void init() {
		truthValues = new ArrayList<Boolean>();
		shortestD = new ArrayList<Integer>();
		previousNodes = new ArrayList<Node>();

		size = graph.get().size();
		for (int i = 0; i < size; i++) {
			truthValues.add(false);
			shortestD.add(inf);
			previousNodes.add(null);
			if (i + 1 == node.get()) {
				shortestD.set(i, 0);
			}
		}
		pln("INITIAL SETUP: ");
		display();
	}
	
	//Solves Djikstra's Algorithm (also uses helper methods)
	public ArrayList<Node> solve() {
		
		//Initializes the arrays with the given shortest distance values from the graph
		setWithGraph(graph.get().get(node.get() - 1));
		
		//runs a for loop to check each node's array and each distance using the check method
		for (int i = 0; i < size; i++) {
			if (i + 1 != node.get()) {
				ArrayList<ArrayList<Integer>> arr = graph.get().get(i);
				int distance = shortestD.get(i);
				check(i, arr, distance);
			}
		}
		
		//Sets the remaining nodes to the home nodes
		homeNodes();
				
		pln("\nAFTER SOLVING:");
		display();
		return previousNodes;
	}
	
	//Checks the shortest distance given a certain Node, its array, and the shortest distance of that Node from the
	//desired node
	public void check(int i, ArrayList<ArrayList<Integer>> arr, int distance) {
		for (int j = 0; j < size; j++) {
			if (j != i) {
				int value = arr.get(j).get(1);
				if ((value + distance) == shortestD.get(j)) {
					previousNodes.set(j, new Node(i + 1));
					truthValues.set(j, true);
				} else if ((value + distance) < shortestD.get(j)) {
					shortestD.set(j, value + distance);
				}
			}
		}
	}
	
	
	//Sets all nodes which didn't receive a Node assignment to a previous Node of the given node, and a true truth value,
	//as this means they are connected directly the given node
	public void homeNodes() {
		for (int j = 0; j < size; j++) {
			if (j != (node.get() - 1)) {
				if (previousNodes.get(j) == null) {
					previousNodes.set(j, node);
				}
				if (truthValues.get(j) == false) {
					truthValues.set(j, true);
				}
			}
		}
	}

	//Given the home array, initializes the other arrays with the shortest distance values which will be used to compare
	public void setWithGraph(ArrayList<ArrayList<Integer>> init) {
		for (int i = 0; i < size; i++) {
			shortestD.set(i, init.get(i).get(1));
			if (i + 1 == node.get()) {
				truthValues.set(i, true);
			}
		}
		pln("\nAFTER SET WITH GRAPH (runs first in example because we are checking the first Node):");
		display();
	}
	
	
	
	//Displays each of the arrays
	public void display() {
		pln("\nShortest Distances: " + shortestD);
		pln("Previous Nodes: " + previousNodes);
		pln("Truth Values: " + truthValues);
	}
	
	//Print Methods
	public static void p (Object args) {
		System.out.print(args);
	}

	public static void pln (Object args) {
		System.out.println(args);
	}
	
	


}
