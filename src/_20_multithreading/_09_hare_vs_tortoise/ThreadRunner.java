package _20_multithreading._09_hare_vs_tortoise;

import java.util.Random;

public class ThreadRunner implements Runnable {
    private String name;
    private int rest;
    private int speed;

    public ThreadRunner(String name, int rest, int speed) {
        this.name = name;
        this.rest = rest;
        this.speed = speed;
    }

    @Override
    public void run() {
        int meters = 0;
        Random rnd = new Random();
        Thread currentThread = Thread.currentThread();
        currentThread.setName(name);

        while (!currentThread.isInterrupted()) {
            if (rnd.nextInt(100) + 1 > rest) {
                meters += speed;
                if (!currentThread.isInterrupted()) {
                    System.out.println(currentThread.getName() + ": " + meters);
                }
            }

			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
                System.out.println(name + ": You won fair and square!");
				break;
			}

			if (!currentThread.isInterrupted() && meters >= 1000) {
				System.out.println(currentThread.getName() + ": finished!");
				HTRaceDemo.finished(currentThread);
				return;
			}
		}
	}

}