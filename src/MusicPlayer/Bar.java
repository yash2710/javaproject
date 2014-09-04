package MusicPlayer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class Bar extends JFrame {
	JPanel panel() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JButton btnPrevious = new JButton("Previous");
		panel.add(btnPrevious);
		
		JButton btnPlaypause = new JButton("Play/Pause");
		panel.add(btnPlaypause);
		
		JButton btnNext = new JButton("Next");
		panel.add(btnNext);
		
		JButton btnStop = new JButton("Stop");
		panel.add(btnStop);
		
//		JButton btnEql = new JButton("Equalizer");
//		panel.add(btnEql);
		
		return panel;
	}

	
	
}
