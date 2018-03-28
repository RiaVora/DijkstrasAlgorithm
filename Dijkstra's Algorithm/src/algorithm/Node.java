package algorithm;

public class Node {
	private int identifier;
	
	//The naming convention for a node must be an integer
	public Node(int identifier) {
		this.identifier = identifier;
	}
	
	public int get() {
		return identifier;
	}
	
	public String toString() {
		return "Node " + identifier;
	}
	
}
