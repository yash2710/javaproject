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

		Bar o_bar = new Bar();
		Playlist o_playlist = new Playlist();
		Library o_library = new Library();
		PlaylistPanel o_playlistpanel = new PlaylistPanel();

		JPanel bar_panel = o_bar.panel();
		JPanel tabbed_playlist = o_playlist.panel();
		JPanel tabbed_playlist_panel = o_playlistpanel.panel();
		tabbed_playlist.add(tabbed_playlist_panel);
		frame.getContentPane().add(bar_panel, BorderLayout.NORTH);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);

		tabbedPane.addTab("Playlist", tabbed_playlist_panel);
		tabbedPane.addTab("Library", o_library.panel());
		frame.setVisible(true);
	}

}
