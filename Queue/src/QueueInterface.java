/*
 * This is the interface for the Queue class.  You must
 * implement these methods.
 */
public interface QueueInterface {

	/*
	 * This method adds record to the tail of the queue.
	 */
	public void enqueue(String record);
	
	/*
	 * This method removes the record at the head of the queue
	 * and returns its value.  An empty string is returned if
	 * the queue is already empty.
	 */
	public String dequeue();
	
	/*
	 * This method prints the queue from head to tail.
	 */
	public void printQueue();
	
}