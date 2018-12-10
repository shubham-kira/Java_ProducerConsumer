
public class Producer implements Runnable {
	ProducerConsumer pc1;
	Thread pr;

	public Producer(ProducerConsumer pc) {
		pr = new Thread(this, "Producer");
		pc1 = pc;
		pr.start();
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				pc1.produce(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Producer produces: " + i + "\n");
			try {
				pr.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}

}
