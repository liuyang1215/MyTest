package mytest;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("满天星");
		MyPanel110 mp = new MyPanel110();
		frame.add(mp);
		frame.setSize(1200 , 768);
		frame.setAlwaysOnTop(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setVisible(true);
		frame.setBackground(Color.BLACK);
		
		
		
		frame.show();

	}

}
class MyPanel110 extends JPanel {
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillOval(80, 100, 100, 100);
		g.setColor(Color.BLACK);
		g.fillOval(100, 80, 100, 100);
		g.setColor(Color.WHITE);
		for (int i = 0; i < 300 ; i++) {
			g.drawString("*", (int)(Math.random()*1200), (int)(Math.random()*768));
		}
	}
}