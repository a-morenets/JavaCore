package _18_stream_api._00_stream_api.matchers;

import java.util.stream.IntStream;

public class NoneMatch {

	void printPrimesInRange(int from, int to) {
		IntStream.range(from, to)
				.filter(this::isPrime)
				.forEach(System.out::println);
	}

	boolean isPrime(int n) {
		return n > 1 && IntStream.range(2, n).noneMatch(i -> n % i == 0);
	}

	public static void main(String[] args) {
		new NoneMatch().printPrimesInRange(200, 1000);
	}

}