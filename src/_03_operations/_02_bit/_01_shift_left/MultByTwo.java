package _03_operations._02_bit._01_shift_left;

public class MultByTwo {

	public static void main(String[] args) {
		int i;
		int num = 0xffffffe;
		
		for (i = 0; i < 4; i++) {
			num <<= 1;
			System.out.println(num);
		}
	}
	
}
