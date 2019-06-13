package _15_exceptions._12_checked;

// Мы не можем бросать, но предупредить о «меньшем»

import java.io.IOException;

public class ThrowMoreThrowsLess {

    public static void main(String[] args) throws IOException {
//        throw new Exception(); // тут ошибка компиляции
    }

    // >> COMPILATION ERROR: unhandled exception: java.lang.Exception
}
