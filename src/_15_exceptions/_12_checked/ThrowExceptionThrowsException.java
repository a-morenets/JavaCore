package _15_exceptions._12_checked;

public class ThrowExceptionThrowsException {

    // Мы можем предупредить точно о том, что бросаем

    public static void main(String[] args) throws Exception { // предупреждаем о Exception
        throw new Exception(); // и кидаем Exception
    }
}
