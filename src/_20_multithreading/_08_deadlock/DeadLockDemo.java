package _20_multithreading._08_deadlock;

public class DeadLockDemo implements Runnable {
	A a = new A();
	B b = new B();

	public DeadLockDemo() {
		Thread.currentThread().setName("Main thread");
		Thread t = new Thread(this, "Concurrent thread");
		t.start();
		
		a.foo(b);
		
		System.out.println("Back to main");
	}

	@Override
	public void run() {
		b.bar(a);
		System.out.println("Back to other thread");
	}
	
	public static void main(String[] args) {
		new DeadLockDemo();
	}

}

class A {
	
	synchronized void foo(B b) {
		String name = Thread.currentThread().getName();
		
		System.out.println(name + " in method A.foo()");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " is trying to call B.last()");
		b.last();
	}
	
	synchronized void last() {
		System.out.println("Inside method A.last()");
	}
	
}

class B {
	
	synchronized void bar(A a) {
		String name = Thread.currentThread().getName();
		
		System.out.println(name + " in method B.foo()");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " is trying to call A.last()");
		a.last();
	}
	
	synchronized void last() {
		System.out.println("Inside method B.last()");
	}

}
