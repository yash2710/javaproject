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
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class window1 extends JFrame{
	window1 w = new window1();
	
	public window1() {
		super("Music");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	JFrame frame(){

		return w;
	}
	public int getWidth(){
		return getContentPane().getWidth();
	}
}
