package MusicPlayer;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MusicPlayer {

	static int x;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		window1 w = new window1();
		w.setSize(500, 300);
//		w.pack();
//		x = w.getContentPane().getWidth();
//		System.out.println(x);
		
		Bar b = new Bar();
		Playlist p = new Playlist();
		Library l = new Library();
		PlaylistPanel pl = new PlaylistPanel();
		
//		JPanel bar = b.bar();
//		getContentPane().add(bar,BorderLayout.NORTH);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
//		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
//		tabbedPane.addTab("Playlist", p);
//		tabbedPane.addTab("Library", l);
		
		w.setVisible(true);
	}
	
	static int getWidth(){
		return x;
	}

}
