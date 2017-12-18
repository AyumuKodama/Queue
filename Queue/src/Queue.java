/*
 * This is the class that implements the queue data structure.
 * You may decide what data structure to use to implement it.
 */
public class Queue {

	// Your implementation here
	
	private Node head;
	
	public Queue() {
		head = null;
	}
	
	public void enqueue(String record) {
		Node newNode = new Node(record);
		newNode.next = null;
		Node pointer = head;
		if (head != null) {
			while (pointer.next != null) {
				pointer = pointer.next;
			}
			pointer.next = newNode;
			newNode.next = null;
		} else {
			head = newNode;
			newNode.next = null;
		}
	}
	
	public String dequeue() {
		String temp = head.record;
		head = head.next;
		return temp;
	}
	
	public void printQueue() {
		Node pointer = head;
		while (pointer != null) {
			System.out.println(pointer.record);
			pointer = pointer.next;
		}
	}
	
}