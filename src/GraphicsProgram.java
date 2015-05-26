import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.EventListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class GraphicsProgram extends JPanel implements KeyListener, ActionListener{
	JFrame window;
	Timer timer;
	
	Ball b = new Ball(0, 0, 50);
	
	int xPos = 1;
	int yPos = 1;
	int xDirection = 1;
	int yDirection = 1;
	
	public static void main(String[] args) {
		GraphicsProgram g = new GraphicsProgram();
		g.start();
	}
	
	private void start()
	{
		window = new JFrame();
		window.add(this);
		window.setSize(500, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		timer = new Timer(1000 / 60, this);
		timer.start();
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 500, 500);
		
		b.paint(g);
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		b.update();
		
		repaint();
		
	}
}
