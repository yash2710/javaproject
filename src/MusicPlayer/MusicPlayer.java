package MusicPlayer;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MusicPlayer {

	public static void main(String[] args) {
		window1 window = new window1();

		JFrame frame = window.frame();
		frame.setSize(500, 300);

		Panels panel = new Panels();

		JPanel bar_panel = panel.Bar();
		JPanel tabbed_playlist = panel.Playlist();
		JPanel tabbed_playlist_panel = panel.PlaylistPanel();
		tabbed_playlist.add(tabbed_playlist_panel);
		frame.getContentPane().add(bar_panel, BorderLayout.NORTH);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);

		tabbedPane.addTab("Playlist", tabbed_playlist_panel);
		tabbedPane.addTab("Library", panel.Library());
		frame.setVisible(true);
	}

}
