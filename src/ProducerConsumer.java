
public class ProducerConsumer {
	boolean avail = false;
	int value = 0;

	public synchronized void produce(int i) throws InterruptedException {
		while (avail == true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		value = i;
		avail = true;
		notify();
	}

	public synchronized int consume() throws InterruptedException {
		while (avail == false) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		avail = false;
		notify();
		return value;
	}

}
