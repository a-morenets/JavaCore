package _08_oop._03_inheritance._07_abstract_vs_interface._02_interface.interfaces;

// This interface defines a standard, 
// about things capable of moving.
public interface CanMove {

    // The methods in Interface are always abstract and public.
    public abstract void run();

    // Even if you do not specify 'public abstract', java always understands.
    void back();

    // Velocity.
    public int getVelocity();

}