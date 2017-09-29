package _20_multithreading._09_hare_vs_tortoise;

public class HTRaceDemo {
	static Thread hare = new Thread(new ThreadRunner("Hare", 90, 100));
	static Thread tortoise = new Thread(new ThreadRunner("Tortoise", 0, 10));

	public static void main(String[] args) {
		hare.start();
		tortoise.start();
	}

	public static void finished(Thread winner) {
		if (winner.getName().equals("Hare"))
			tortoise.interrupt();
		else if (winner.getName().equals("Tortoise"))
			hare.interrupt();
	}

}