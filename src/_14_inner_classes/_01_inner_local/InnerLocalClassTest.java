package _14_inner_classes._01_inner_local;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class InnerLocalClassTest {

	public static void main(String[] args) {
		TalkingClock clock = new TalkingClock(1000, true);
		clock.start();
		// выполнять программу до тех пор, пока пользователь не щелкнет на кнопке ОК
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}

}

class TalkingClock {
	private int interval;
	private boolean beep;

	public TalkingClock(int interval, boolean beep) {
		this.interval = interval;
		this.beep = beep;
	}

	public void start() {
		class TimePrinter implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent event) {
				System.out.println("At the tone, the time is " + new Date());
				if (beep)
					Toolkit.getDefaultToolkit().beep();
			}
			
		}
		
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(interval, listener);
		t.start();
	}

}
