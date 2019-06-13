package _15_exceptions._06_nested_try_catch_finally;

public class NoException {

    // Вложенный try-catch-finally без исключения

    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                // НИЧЕГО
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3"); // НЕ заходим - нет исключения
            } finally {
                System.err.print(" 4"); // заходим всегда
            }
            System.err.print(" 5");     // заходим - выполнение в норме
        } catch (Exception e) {
            System.err.print(" 6");     // НЕ заходим - нет исключения
        } finally {
            System.err.print(" 7");     // заходим всегда
        }
        System.err.print(" 8");         // заходим - выполнение в норме
    }

    // >> 0 1 2 4 5 7 8
}
