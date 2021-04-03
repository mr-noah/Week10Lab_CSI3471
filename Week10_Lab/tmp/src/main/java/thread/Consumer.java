package thread;

class Consumer extends Thread {
	private CubbyHole cubbyhole;
	private int number;

	public Consumer(CubbyHole c, int number) {
		cubbyhole = c;
		this.number = number;
	}

	public void run() {
		int value = 0;
		for (int i = 0; i < 10; i++) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			value = cubbyhole.get();
			System.out.println("Consumer #" + this.number + " got: " + value + " :: "+System.currentTimeMillis());
		}
	}
}
