package _18_stream_api._99_samples.matchers;

import java.util.stream.IntStream;

public class NoneMatch {

	boolean isPrime(int n) {
		return n > 1 && IntStream.range(2, n).noneMatch(i -> n % i == 0);
	}

	void printPrimesInRange(int from, int to) {
		IntStream.range(from, to).filter(this::isPrime).forEach(System.out::println);
	}

	public static void main(String[] args) {
		new NoneMatch().printPrimesInRange(200, 1000);
	}

}