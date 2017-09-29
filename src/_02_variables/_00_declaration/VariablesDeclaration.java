package _02_variables._00_declaration;

import java.util.Date;

/**
 * Declaration of variables
 *
 * Created by Oleksii on 13.07.2017.
 */
public class VariablesDeclaration {

    public static void main(String[] args) {

//        byte byte; // reserved word can not be an identifier's name
//        float 4_float; // var name can not start with a digit
        long _long; // allowed (c++ style) but not recommended
        boolean $test; // start with $ is allowed but not recommended
        int i, j; // both are integer
        Date hireday, hireDay; // two different names ("camel" style is recommended: hireDay)

        // see also isJavaldentifierStart(), isJavaldentifierPart()
        System.out.println("Identifier can start with $ ? " + Character.isJavaIdentifierStart('$'));
        System.out.println("$ sign can be a part of an identifier ? " + Character.isJavaIdentifierPart('$'));
    }

}
