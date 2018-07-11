package _05_strings._02_strings_comparing;

public class StringsComparing {
    public static void main(String[] args) {
        // NOTE: For String, two ways to initialize the object below are not the same:
        String str1 = "String 1";
        String str2 = new String("String 1");

        // The 'new' operator create the memory area (1)
        // Contains the "This is text" String
        // And 's1' is a reference that points to (1).
        String s1 = new String("This is text");

        // The 'new' operator create the memory area (2)
        // Contains the "This is text" String
        // And s2 is a reference that points to (2)
        String s2 = new String("This is text");

        // Use the operator== to compare 's1' and 's2'.
        // Results is false.
        // It is obviously different from what you think.
        // The reason is the type of reference
        // Operator == compares the positions that they point to.
        boolean e1 = (s1 == s2); // false

        System.out.println("s1 == s2 ? " + e1);

        // Without any 'new' operator.
        // Java creates a reference named 'obj'
        // And pointing to a memory area that 's1' points to.
        Object obj = s1;

        // 2 references 'obj' and 's1' are all pointing to one area of memory.
        // Results is true.
        boolean e2 = (obj == s1); // true

        System.out.println("obj == s1 ? " + e2);


        // comparing Strings
        System.out.println("Are strings equal? " + "".equals(new String())); // true
        System.out.println("hello".trim() == "hello".trim()); // true, but == highly NOT recommended!
    }
}
