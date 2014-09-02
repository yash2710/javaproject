package MusicPlayer;

import javax.swing.JFrame;

public class MusicPlayer {

	static int x;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		window1 w = new window1();
		w.setSize(500, 300);
		w.pack();
		x = w.getContentPane().getWidth();
		System.out.println(x);
		w.setVisible(true);
	}
	
	static int getWidth(){
		return x;
	}

}
