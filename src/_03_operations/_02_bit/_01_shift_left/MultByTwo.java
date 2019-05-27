package _03_operations._02_bit._01_shift_left;

public class MultByTwo {

	public static void main(String[] args) {
		int i;
		int num = 0xffffffe; // 0000 1111 1111 1111 1111 1111 1111 1110
		System.out.println("num = " + num);

		// step 0: 0001 1111 1111 1111 1111 1111 1111 1100
		// step 1: 0011 1111 1111 1111 1111 1111 1111 1000
		// step 2: 0111 1111 1111 1111 1111 1111 1111 0000
		// step 3: 1111 1111 1111 1111 1111 1111 1110 0000 // -32
		for (i = 0; i < 4; i++) {
			num <<= 1;
			System.out.println(num);
		}
	}
	
}
