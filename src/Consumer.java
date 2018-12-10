
public class Consumer implements Runnable {
	ProducerConsumer pc2;
	Thread cr;

	public Consumer(ProducerConsumer pc) {
		pc2 = pc;
		cr = new Thread(this, "Consumer");
		cr.start();
	}

	@Override
	public void run() {
		int value = 0;
		for (int i = 1; i <= 10; i++) {
			try {
				value = pc2.consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Consumer consumes: " + value + "\n");
		}
	}

}
