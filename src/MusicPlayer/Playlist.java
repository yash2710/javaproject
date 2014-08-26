package MusicPlayer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class Playlist extends JFrame{
	JPanel playlist() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		
		JLabel lblThisIsPlaylist = new JLabel("This is playlist");
		panel.add(lblThisIsPlaylist);
		
		JButton btnNewButton = new JButton("New Button");
		panel.add(btnNewButton);
		
		return panel;
		
	}
	

}
