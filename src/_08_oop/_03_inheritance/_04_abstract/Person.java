package _08_oop._03_inheritance._04_abstract;

public abstract class Person {
    private String name;

    // Default constructor
    public Person() {
        this.name = getDescription();
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // This is an abstract method.
    // Returns the name of this Person.
    // The specific content of this method will be implemented in the subclass.
    public abstract String getDescription();

}
