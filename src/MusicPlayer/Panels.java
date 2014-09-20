package MusicPlayer;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Panels extends JFrame {
	JPanel Playlist() {

		getContentPane().setLayout(getLayout());
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.WEST);
		String[] pLists = { "Recently Added", "Recently Played" };

		JList list = new JList(pLists);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		panel.add(new JScrollPane(list));
		list.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		return panel;

	}

	JPanel PlaylistPanel() {

		String[] s = { "a", "b" };

		JList list = new JList(s);
		// list.setMaximumSize(new Dimension(50,50));
		JPanel panel = new JPanel();
		// list.setPreferredSize(new
		// Dimension(MusicPlayer.x,getContentPane().getHeight()));
		getContentPane().setLayout(getLayout());
		panel.add(new JScrollPane(list));

		return panel;
	}

	JPanel Library() {
		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);

		return panel;
	}

	JPanel Bar() {

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

		// JButton btnEql = new JButton("Equalizer");
		// panel.add(btnEql);

		return panel;
	}

}
