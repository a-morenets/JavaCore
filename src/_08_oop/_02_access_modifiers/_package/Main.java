package _08_oop._02_access_modifiers._package;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int intValue;
        ParentClass parentClass = new ParentClass();

        intValue = parentClass.publicValue;
        intValue = parentClass.protectedValue;
        intValue = parentClass.defaultValue;
//        intValue = parentClass.privateValue;
        intValue = parentClass.getPrivateValue();
    }
    
}
