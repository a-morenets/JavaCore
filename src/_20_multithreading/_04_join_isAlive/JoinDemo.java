package _20_multithreading._04_join_isAlive;

public class JoinDemo {

	public static void main(String[] args) {
		NewThread t1 = new NewThread("One");
		NewThread t2 = new NewThread("Two");
		NewThread t3 = new NewThread("Three");

		System.out.println("Thread 1 is alive: " + t1.t.isAlive());
		System.out.println("Thread 2 is alive: " + t2.t.isAlive());
		System.out.println("Thread 3 is alive: " + t3.t.isAlive());
		
		try {
			t1.t.join();
			t2.t.join();
			t3.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Thread 1 is alive: " + t1.t.isAlive());
		System.out.println("Thread 2 is alive: " + t2.t.isAlive());
		System.out.println("Thread 3 is alive: " + t3.t.isAlive());

		System.out.println("Main thread finished");
	}

}

class NewThread implements Runnable {
	String name;
	Thread t;
	
	public NewThread(String name) {
		this.name = name;
		this.t = new Thread(this, name);
		System.out.println("New thread: " + t);
		t.start();
	}

	@Override
	public void run() {
		for (int i = 5; i > 0; i--) {
			System.out.println(name + ": " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + " finished");
	}
	
}