package _13_interfaces._04_lambda;

import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class LambdaTest {

	public static void main(String[] args) {
		Timer t = new Timer(1000, event -> System.out.println("The time is " + new Date()));
		t.start();
		
		// ��������� ��������� �� ��� ���, ���� ������������ �� ������� ������ "Ok"
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}

}
