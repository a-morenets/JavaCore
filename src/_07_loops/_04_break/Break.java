package _07_loops._04_break;

public class Break {

	public static void main(String[] args) {
		int count = 10;
		for (;;)
			if (--count == 5)
				break;
		System.out.println("count = " + count);

		// break with label
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int i, j = -1;
		label:
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[0].length; j++) {
				System.out.println(i + ";" + j);
				if (arr[i][j] == 5)
					break label;
			}
		}
		System.out.println("Element 5 found at " + i + ";" + j);
	}

}
