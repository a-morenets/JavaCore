package _08_oop._00_classes.classLoader;

import com.sun.javafx.util.Logging;

import java.util.ArrayList;

public class PrintClassLoader {

    public void printClassLoaders() throws ClassNotFoundException {

        System.out.println("Classloader of this class:"
                + PrintClassLoader.class.getClassLoader());

        System.out.println("Classloader of Logging:"
                + Logging.class.getClassLoader());

        System.out.println("Classloader of ArrayList:"
                + ArrayList.class.getClassLoader());
    }

    public static void main(String[] args) throws ClassNotFoundException {
        PrintClassLoader printClassLoader = new PrintClassLoader();
        printClassLoader.printClassLoaders();
    }
}
