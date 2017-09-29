package _20_multithreading._03_extend_thread;


class NewThread extends Thread {

	public NewThread() {
		super();
		System.out.println("Extended thread was created");
		start();
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
		
		System.out.println("Extended thread finished");
	}

}

public class ExtendThreadExample {
	
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