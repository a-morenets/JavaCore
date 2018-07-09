package _20_multithreading._05_synchronized_method;

public class SyncMethodExample {

	public static void main(String[] args) {
		CallMe target = new CallMe();
		Caller ob1 = new Caller(target, "Welcome");
		Caller ob2 = new Caller(target, "to the Synchronized");
		Caller ob3 = new Caller(target, "World!");
		
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class CallMe {
	
	synchronized void call(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
	
}

class Caller implements Runnable {
	CallMe target;
	Thread t;
	String message;

	public Caller(CallMe target, String message) {
		this.target = target;
		this.message = message;
		this.t = new Thread(this);
		this.t.start();
	}

	@Override
	public void run() {
		target.call(message);
	}
	
}
