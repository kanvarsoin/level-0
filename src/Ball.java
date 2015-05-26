import java.awt.Color;
import java.awt.Graphics;


public class Ball {
	int xpos, ypos, size;
	
	public Ball(int x, int y, int s)
	{
		xpos = x;
		xpos = y;
		size = s;
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillOval(xpos, ypos, size, size);
	}
	
	public void update()
	{
		size++;
	}
}
