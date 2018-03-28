package algorithm;
import java.util.ArrayList;
import java.util.Arrays;

public class Graph {
	private ArrayList<ArrayList<ArrayList<Integer>>> graph;
	

	public static void main(String[] args) {
		Graph g = new Graph();
		
	}
	
	
	
	public Graph() {
		
	}
	
	public void useGivenData() {
		ArrayList<ArrayList<Integer>> one = new ArrayList<ArrayList<Integer>>(
				Arrays.asList(new ArrayList<Integer>(
						Arrays.asList(1, 0)), new ArrayList<Integer>(
						Arrays.asList(2, 7)), new ArrayList<Integer>(
								Arrays.asList(3, 9)), new ArrayList<Integer>(
										Arrays.asList(4, 20)), new ArrayList<Integer>(
												Arrays.asList(5, 20)), new ArrayList<Integer>(
														Arrays.asList(6, 11))));
		ArrayList<ArrayList<Integer>> two = new ArrayList<ArrayList<Integer>>(
				Arrays.asList(new ArrayList<Integer>(
						Arrays.asList(1, 7)), new ArrayList<Integer>(
						Arrays.asList(2, 0)), new ArrayList<Integer>(
								Arrays.asList(3, 10)), new ArrayList<Integer>(
										Arrays.asList(4, 15)), new ArrayList<Integer>(
												Arrays.asList(5, 21)), new ArrayList<Integer>(
														Arrays.asList(6, 12))));
		
		ArrayList<ArrayList<Integer>> three = new ArrayList<ArrayList<Integer>>(
				Arrays.asList(new ArrayList<Integer>(
						Arrays.asList(1, 9)), new ArrayList<Integer>(
								Arrays.asList(2, 10)), new ArrayList<Integer>(
										Arrays.asList(3, 0)), new ArrayList<Integer>(
										Arrays.asList(4, 11)), new ArrayList<Integer>(
												Arrays.asList(5, 11)), new ArrayList<Integer>(
														Arrays.asList(6, 2))));
		
		ArrayList<ArrayList<Integer>> four = new ArrayList<ArrayList<Integer>>(
				Arrays.asList(new ArrayList<Integer>(
						Arrays.asList(1, 20)), new ArrayList<Integer>(
								Arrays.asList(2, 15)), new ArrayList<Integer>(
										Arrays.asList(3, 11)), new ArrayList<Integer>(
												Arrays.asList(4, 0)), new ArrayList<Integer>(
												Arrays.asList(5, 6)), new ArrayList<Integer>(
														Arrays.asList(6, 13))));

		ArrayList<ArrayList<Integer>> five = new ArrayList<ArrayList<Integer>>(
				Arrays.asList(new ArrayList<Integer>(
						Arrays.asList(1, 20)), new ArrayList<Integer>(
								Arrays.asList(2, 21)), new ArrayList<Integer>(
										Arrays.asList(3, 11)), new ArrayList<Integer>(
												Arrays.asList(4, 6)), new ArrayList<Integer>(
												Arrays.asList(5, 0)), new ArrayList<Integer>(
														Arrays.asList(6, 9))));
		

		ArrayList<ArrayList<Integer>> six = new ArrayList<ArrayList<Integer>>(
				Arrays.asList(new ArrayList<Integer>(
						Arrays.asList(1, 11)), new ArrayList<Integer>(
								Arrays.asList(2, 12)), new ArrayList<Integer>(
										Arrays.asList(3, 2)), new ArrayList<Integer>(
												Arrays.asList(4, 13)), new ArrayList<Integer>(
												Arrays.asList(5, 9)), new ArrayList<Integer>(
														Arrays.asList(6, 0))));
		
		
		
		
		

		
		graph = new ArrayList<ArrayList<ArrayList<Integer>>>(
				Arrays.asList(one, two, three, four, five, six));
	}
	
	public void print() {
		System.out.print(graph);
	}
	
	public ArrayList<ArrayList<ArrayList<Integer>>> get() {
		return graph;
	}

}
