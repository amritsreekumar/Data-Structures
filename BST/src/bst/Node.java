package bst;

public class Node {
	public int data;
	public Node left;
	public Node right;
	
	public Node() {
		data = 0;
		left = null;
		right = null;
	}
	
	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
	
	public void setleft(Node n) {
		left = n;
	}
	
	public void setright(Node m) {
		right = m;
	}
	

}
