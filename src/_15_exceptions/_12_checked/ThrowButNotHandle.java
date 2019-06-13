package _15_exceptions._12_checked;

public class ThrowButNotHandle {

    // Мы не можем бросать, но не предупредить

    public static void main(String[] args) {
//        throw new Exception(); // тут ошибка компиляции
    }

    // >> COMPILATION ERROR: unhandled exception: java.lang.Exception
}
