package _15_exceptions._05_finally;

public class NoFinally {

    // finally-секция НЕ вызывается только если мы «прибили» JVM

    public static void main(String[] args) {
        try {
            System.exit(42);
//            Runtime.getRuntime().exit(42); // System.exit(42) и Runtime.getRuntime().exit(42) — это синонимы
//            Runtime.getRuntime().halt(42); // еще синоним
        } finally {
            System.err.println("finally");
        }

        // А также finally-секция не может «предотвратить» выход из метода,
        // если try-блок вызвал return («more» — не выводится в консоль)
        try {
            System.err.println("try");
            if (true) {return;}
        } finally {
            System.err.println("finally");
        }
        System.err.println("more");

        // >> try
        // >> finally
    }
}
