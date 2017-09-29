package _20_multithreading._02_runnable;

class NewThread implements Runnable {
	Thread t;
	
	public NewThread() {
		this.t = new Thread(this);
		System.out.println("Thread was created");
		t.start();
	}

	@Override
	public void run() {
		for (int i = 5; i > 0; i--) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Runnable thread finished");
	}

}

public class RunnableExample {
	
	public static void main(String[] args) {
		new NewThread();
		
		for (int i = 5; i > 0; i--) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Main thread finished");
	}
	
}