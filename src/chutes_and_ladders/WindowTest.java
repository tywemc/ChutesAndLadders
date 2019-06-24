package chutes_and_ladders;

import javax.swing.JFrame;

public class WindowTest {

	public static void main(String[] args) 
	{
		JFrame frame = new Window();
		frame.setTitle("A Frame with two components");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
