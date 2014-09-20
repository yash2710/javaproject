package MusicPlayer;

import java.awt.BorderLayout;
import java.awt.Dimension;

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

	JPanel PlaylistPanel(int w,int h) {

		String[] s = { "a", "b" };

		JList<String> list = new JList<String>(s);
		JPanel panel = new JPanel();
		JScrollPane scroll = new JScrollPane(list);
		scroll.setPreferredSize(new Dimension((int)(w*0.7),h));
		getContentPane().setLayout(getLayout());
		panel.add(scroll);

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
