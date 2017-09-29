package _20_multithreading._00_main_thread;

public class MainThreadExample {

	public static void main(String[] args) {
		System.out.println("Main thread started");

		System.out.println("Current thread: " + Thread.currentThread().getName());
		Thread.currentThread().setName("HelloThread");
		System.out.println("Current thread: " + Thread.currentThread().getName());
		
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Main thread finished");
	}

}
