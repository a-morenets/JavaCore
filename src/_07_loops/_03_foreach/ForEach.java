package _07_loops._03_foreach;

public class ForEach {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        for (int element: arr) {
            System.out.println("element = " + element);
        }
    }

}
