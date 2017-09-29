package _07_loops._05_continue;

public class Continue {

    public static void main(String[] args) {

        // print all odd numbers from 0 to 10
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println("i = " + i);
        }
        
		// continue with label
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int i = -1, j = -1;
		label:
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[0].length; j++) {
				System.out.println(i + ";" + j);
				if (arr[i][j] == 5)
					continue label;
			}
		}
		System.out.println("Element 5 found at " + i + ";" + j);

    }

}
