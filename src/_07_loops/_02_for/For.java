package _07_loops._02_for;

public class For {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 0, j = 10; i <= j; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }

        int i = 0;
        for (; i < 10; i++) {
            System.out.println("i = " + i);
        }

        int j = 0;
        for (; j < 10;) {
            System.out.println("j = " + j);
            j++;
        }
    }

}
