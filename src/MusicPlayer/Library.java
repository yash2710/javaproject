package MusicPlayer;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Library extends JFrame{
	JPanel panel() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		
		return panel;
	}
		
}
