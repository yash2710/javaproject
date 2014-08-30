package MusicPlayer;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PlaylistPanel extends JFrame {
	JPanel playlistPanel() {
		
		String[] s = {"a","b"};
		
		JList list = new JList(s);
		JPanel panel = new JPanel();
		getContentPane().setLayout(getLayout());
		panel.add(new JScrollPane(list));
		
		return panel;
	}

	
	
}
