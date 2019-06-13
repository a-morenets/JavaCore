package _15_exceptions._13_unchecked;

public class ThrowsRTE {

    // Вызов метода, который «пугает» unchecked исключением не накладывает на нас никаких обязанностей.

    public static void main(String[] args) {
        f();
    }

    public static void f() throws RuntimeException {
    }
}
