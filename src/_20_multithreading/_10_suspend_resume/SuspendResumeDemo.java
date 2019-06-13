package _20_multithreading._10_suspend_resume;

/**
 * Use described below methodics instead of deprecated suspend() and resume() methods
 * @author Шилдт
 *
 */
public class SuspendResumeDemo {

	public static void main(String[] args) {
		NewThread ob1 = new NewThread("One");
		NewThread ob2 = new NewThread("Two");
		
		try {
			Thread.sleep(1000);
			ob1.mySuspend();
			System.out.println("Thread 1 - suspend");
			Thread.sleep(1000);
			ob1.myResume();
			System.out.println("Thread 1 - resume");
			
			ob2.mySuspend();
			System.out.println("Thread 2 - suspend");
			Thread.sleep(1000);
			ob2.myResume();
			System.out.println("Thread 2 - resume");	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Wait for finish of threads");
		try {
			ob1.t.join();
			ob2.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main thread finished");
	}
	
}

class NewThread implements Runnable {
	String name;
	Thread t;
	boolean suspendFlag;
	
	public NewThread(String name) {
		this.name = name;
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
		t.start();
	}

	@Override
	public void run() {
		try {
			for (int i = 15; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(200);
				synchronized (this) {
					while (suspendFlag)
						wait();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name + " finished");
	}
	
	synchronized void mySuspend() {
		suspendFlag = true;
	}
	
	synchronized void myResume() {
		suspendFlag = false;
		notify();
	}
	
}