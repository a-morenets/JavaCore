package _18_stream_api._99_samples.matchers;

import java.util.stream.IntStream;

public class AllMatch {

	public static void main(String[] args) {
		System.out.println(
				IntStream.range(0, 10)
				.peek(System.out::println)
				.allMatch(i -> i < 10)
		);
	}

}
