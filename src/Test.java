
public class Test {
	public static void main(String args[]) {
		ProducerConsumer pc = new ProducerConsumer();
		Producer prod = new Producer(pc);
		Consumer cons = new Consumer(pc);
	}
}
