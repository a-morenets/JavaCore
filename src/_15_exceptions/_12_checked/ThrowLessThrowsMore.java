package _15_exceptions._12_checked;

public class ThrowLessThrowsMore {

    // Мы можем предупредить о большем, чем мы бросаем

    public static void main(String[] args) throws Throwable { // предупреждаем "целом" Throwable
        throw new Exception(); // а кидаем только Exception
    }
}
