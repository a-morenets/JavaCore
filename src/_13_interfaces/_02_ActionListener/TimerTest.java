package _13_interfaces._02_ActionListener;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTest {

	public static void main(String[] args) {
		ActionListener listener = new TimePrinter();
		// ��������� ������, ���������� �������� �������
		// ������ 10 ������
		Timer t = new Timer(10000, listener);
		t.start();
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
	
}
