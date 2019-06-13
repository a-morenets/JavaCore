package _04_arrays._04_skills;

public class Skills {

	public static void main(String[] args) {

		int[] arr = {0, 1, 2, 3, 4};

		/*
		 * Есть массив
		 * int[] arr = {0, 1, 2, 3, 4};
		 * Написать программу, которая выведет:
		 * 0 0 0 0 0
		 * 1 1 1 1
		 * 2 2 2
		 * 3 3
		 * 4
		 */
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("");
		}
		System.out.println("--------------");

		/*
		 * Есть массив
		 * int[] arr = {0, 1, 2, 3, 4};
		 * Написать программу, которая выведет:
		 * 0 1 2 3 4
		 * 0 1 2 3
		 * 0 1 2
		 * 0 1
		 * 0
		 */
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println("");
		}
		System.out.println("--------------");

		/*
		 * Есть массив
		 * int[] arr = {0, 1, 2, 3, 4};
		 * Написать программу, которая выведет:
		 * 0 1 2 3 4
		 * 1 2 3 4
		 * 2 3 4
		 * 3 4
		 * 4
		 */
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println("");
		}
		System.out.println("--------------");
    }
}
