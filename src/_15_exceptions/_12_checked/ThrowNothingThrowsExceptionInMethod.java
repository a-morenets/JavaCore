package _15_exceptions._12_checked;

// Даже если предупреждаем о том, чего нет — все обязаны бояться

public class ThrowNothingThrowsExceptionInMethod {

    public static void main(String[] args) {
//        f(); // тут ошибка компиляции
    }

    public static void f() throws Exception {
    }
}
