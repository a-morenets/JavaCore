package _08_oop._03_inheritance._07_abstract_vs_interface._02_interface.interfaces;

// This interface defines a standard, 
// about things capable of drinking.
public interface CanDrink {

    // Fields in Interface are always 'public static final'.
    // Whether you declare it or not.
    public static final String PEPSI = "PEPSI";
    final String NUMBER_ONE = "NUMBER ONE";
    String SEVENUP = "SEVEN UP";

    public void drink();

}