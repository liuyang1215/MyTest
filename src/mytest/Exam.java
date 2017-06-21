package mytest;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exam extends JPanel {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("乌龟");
		frame.setSize(400,600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Exam panel = new Exam();
		frame.add(panel);
		frame.setVisible(true);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		setBackground(Color.LIGHT_GRAY);
		g.setColor(new Color(80, 180, 80));
		g.fillOval(140, 285, 150, 150);
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(155, 300, 140, 140);
		g.fillOval(195, 260, 200, 240);
		g.setColor(new Color(80, 180, 80));
		g.fillOval(145, 355, 40, 40);
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(157, 367, 15, 15);
		g.setColor(new Color(80, 180, 80));
		g.setColor(new Color(80, 180, 80));
		g.fillOval(120, 80, 60, 100);
		g.setColor(Color.white);
		g.fillOval(130, 90, 10, 10);
		g.fillOval(160, 90, 10, 10);
		g.setColor(Color.black);
		g.fillOval(130, 90, 8, 8);
		g.fillOval(160, 90, 8, 8);
		g.setColor(new Color(80, 180, 80));
		g.fillOval(50, 140, 50, 70);
		g.fillOval(200, 140, 50, 70);
		g.fillOval(50, 280, 50, 70);
		g.fillOval(200, 280, 50, 70);
		g.setColor(new Color(50, 160, 50));
		g.fillOval(60, 150, 180, 200);
		g.setColor(new Color(50, 200, 50));
		g.fillOval(70, 160, 160, 180);
		g.setColor(Color.BLACK);
		g.drawLine(130, 210, 170, 210);
		g.drawLine(170, 210, 200, 240);
		g.drawLine(200, 240, 170, 270);
		g.drawLine(170, 270, 130, 270);
		g.drawLine(130, 270, 100, 240);
		g.drawLine(100, 240, 130, 210);
		g.drawLine(130, 210, 100, 180);
		g.drawLine(170, 210, 200, 180);
		g.drawLine(100, 240, 70, 250);
		g.drawLine(200, 240, 230, 250);
		g.drawLine(130, 270, 100, 320);
		g.drawLine(170, 270, 200, 320);
	}
}
