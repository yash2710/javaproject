package MusicPlayer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class window1 extends JFrame{
	public window1() {
		
		Playlist p = new Playlist();
		Bar b = new Bar();
		
		JPanel bar = b.bar();
		getContentPane().add(bar,BorderLayout.NORTH);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		tabbedPane.addTab("Playlist", p.playlist());
		
		
	}
}
