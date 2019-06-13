package _15_exceptions._05_finally;

public class FinallyDoesNotFixException {

    // finally-секция не может «починить» try-блок завершившийся исключение
    // (заметьте, «more» — не выводится в консоль)
    public static void main(String[] args) {
        try {
            System.err.println("try");
            if (true) {
                throw new RuntimeException();
            }
            // Трюк с «if (true) {...}» требуется,
            // так как иначе компилятор обнаруживает недостижимый код (последняя строка)
            // и отказывается его компилировать
        } finally {
            System.err.println("finally");
        }
        System.err.println("more");
    }

    // >> try
    // >> finally
    // >> Exception in thread "main" java.lang.RuntimeException
}
