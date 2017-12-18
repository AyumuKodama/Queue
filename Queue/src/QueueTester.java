
public class QueueTester {

	public static void main(String[] args) {
		String[] testData = {"apple", "banana", "carrot", "durian",
				"eggplant"};
		Queue queue = new Queue();
		for (String elem : testData) {
			queue.enqueue(elem);
		}
		queue.printQueue();
		// Should be:
		//   apple
		//   banana
		//   carrot
		//   durian
		//   eggplant
		queue.dequeue();
		queue.enqueue("fruit");
		queue.enqueue("guacamole");
		queue.dequeue();
		queue.printQueue();
		// Should be:
		//   carrot
		//   durian
		//   eggplant
		//   fruit
		//   guacamole
	}
	
}