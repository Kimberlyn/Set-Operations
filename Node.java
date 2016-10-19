public class Node {

	private int value;
	private Node next;

	// METHOD: constructor
	public Node(int value) {
		this.value = value;
		this.next = null;
	}

	// METHOD: constructor
	public Node(int value, Node next) {
		this.value = value;
		this.next = next;
	}

	// METHOD: getValue
	// returns value of Node
	public int getValue() {
		return value;
	}

	// METHOD: setValue
        // sets value of Node
	public void setValue(int value) {
		this.value = value;
	}

	// METHOD: getNext
        // returns next Node
	public Node getNext() {
		return next;
	}

	// METHOD: setNext
        // sets value of next Node
	public void setNext(Node next) {
		this.next = next;
	}
}
