package _15_exceptions._05_finally;

public class TryReturnFinallyReturn {

    // finally-секция может «перебить» throw/return при помощи другого throw/return

    public static void main(String[] args) {
        System.err.println(f());
    }

    public static int f() {
        try {
            return 0;
            // or
//            throw new RuntimeException();
        } finally {
            return 1;
        }
    }

    // >> 1
}
