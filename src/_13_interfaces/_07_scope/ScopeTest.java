package _13_interfaces._07_scope;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class ScopeTest {

	public static void repeatMessage(String text, int delay) {
		ActionListener listener = event -> {
			System.out.println(text);
			Toolkit.getDefaultToolkit().beep();
		};
		new Timer(delay, listener).start();
	}

	public void init() {
		ActionListener listener = event -> {
			System.out.println(this.toString()); // this === ScopeTest's instance, not listener's
		};
	}

	public static void main(String[] args) {
		repeatMessage("Hello", 1000);
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
		
		Path first = Paths.get("/usr/bin");
//		Comparator<String> comp = (first, second) -> first.length() - second.length(); // ОШИБКА: переменная first уже определена!
	}

}
