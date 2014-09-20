package MusicPlayer;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MusicPlayer {

	static int w, h;
	public static void main(String[] args) {
		window1 window = new window1();

		JFrame frame = window.frame();
		frame.setSize(500, 300);
		frame.setVisible(true);
		Panels panel = new Panels();
//		System.out.println(frame.getContentPane().);
		JPanel bar_panel = panel.Bar();
		JPanel tabbed_playlist = panel.Playlist();
		w = frame.getContentPane().getWidth();
		h = frame.getContentPane().getHeight();
		System.out.println(w);
		JPanel tabbed_playlist_panel = panel.PlaylistPanel(w,h);
		tabbed_playlist.add(tabbed_playlist_panel);
		frame.getContentPane().add(bar_panel, BorderLayout.NORTH);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);

		tabbedPane.addTab("Playlist", tabbed_playlist_panel);
		tabbedPane.addTab("Library", panel.Library());
		
	}

}
