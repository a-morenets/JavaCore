package _15_exceptions._05_finally;

public class TryThrowFinallyThrow {

    public static void main(String[] args) {
        System.err.println(f());
    }

    public static int f() {
        try {
            throw new Error();
            // or
//            return 0;
        } finally {

            throw new RuntimeException();
        }
    }

    // >> Exception in thread "main" java.lang.RuntimeException
}
