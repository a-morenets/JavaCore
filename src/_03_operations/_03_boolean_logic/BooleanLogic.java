package _03_operations._03_boolean_logic;

/**
 * Logic operations
 */
public class BooleanLogic {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = a | b;
		boolean d = a & b;
		boolean e = a ^ b;
		boolean f = !a & b | a & !b;
		boolean g = !a;
		
		System.out.println("a = " + a);		
		System.out.println("b = " + b);		
		System.out.println("a | b = " + c);		
		System.out.println("a & b = " + d);		
		System.out.println("a ^ b= " + e);		
		System.out.println("!a & b | a & !b= " + f);		
		System.out.println("!a = " + g);		

		int x = 1;
		
        // ternary operator
        System.out.println(x == 0 ? "x == 0" : "x != 0");

        // && vs &
        x = 0;
        if (x != 0 && 5/x > 2) {
            System.out.println("This will never print");
        } else {
            System.out.println("Can not div by 0");
        }

        if (x != 0 & 5/x > 2) {
            System.out.println("5/x > 2"); // this will never print (Exception: div by 0)
        }

	}
	
}
