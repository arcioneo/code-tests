package beans;

public class Node {

	public  int frequency;
	public  char data;
	public  Node left, right;
	
	
	
	public Node() {
		super();
	}

	public Node(int frequency, char data, Node left, Node right) {
		super();
		this.frequency = frequency;
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public char getData() {
		return data;
	}
	public void setData(char data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "Node [frequency=" + frequency + ", data=" + data + ", left=" + left + ", right=" + right + "]";
	}
	
	
	
	
}
