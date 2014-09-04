package MusicPlayer;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Playlist extends JFrame {
	Playlist() {
		// super("Playlist");

		
		
		getContentPane().setLayout(getLayout());
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.WEST);
		String[] pLists = { "Recently Added", "Recently Played" };

		JList list = new JList(pLists);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		panel.add(new JScrollPane(list));
		panel.add(p.playlistPanel());
		list.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

//		return panel;

	}

}
