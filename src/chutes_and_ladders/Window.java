package chutes_and_ladders;

import java.awt.GraphicsConfiguration;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class Window extends JFrame 
{
	private JButton button;
	private JLabel label;
	private JButton button2;
	private JLabel label2;
	
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 300;

	public Window()
	{
		createComponents();
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	private void createComponents()
	{
		button = new JButton("Click me!");
		label = new JLabel("Gracie isn't impressed!");
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(label);
		button2 = new JButton("Don't click me!");
		label2 = new JLabel("Now she's impressed");
		JPanel pane2 = new JPanel();
		panel.add(button2);
		panel.add(label2);
		add(panel);
	}
}











