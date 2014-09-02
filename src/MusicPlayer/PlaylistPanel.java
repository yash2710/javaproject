package MusicPlayer;

import java.awt.Dimension;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PlaylistPanel extends JFrame {
	JPanel playlistPanel() {
		
		String[] s = {"a","b"};
		
		JList list = new JList(s);
//		list.setMaximumSize(new Dimension(50,50));
		JPanel panel = new JPanel();
//		list.setPreferredSize(new Dimension(MusicPlayer.x,getContentPane().getHeight()));
		System.out.println(MusicPlayer.getWidth());
		getContentPane().setLayout(getLayout());
		panel.add(new JScrollPane(list));
		
		return panel;
	}

	
	
}
