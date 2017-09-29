package _07_loops._06_return;

public class Return {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                return;
        }

        System.out.println("This will be never printed.");
    }

}
