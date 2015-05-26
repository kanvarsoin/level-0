// Copyright Wintriss Technical Schools 2013

import java.awt.Component;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.TurtlePanel;

public class Move implements KeyEventDispatcher
{
	
	public int foodX = 0;
	public int foodY = 0;
	public Random rand = new Random();

	private void feedTheTortoise()
	{
		addFood(rand.nextInt(700), rand.nextInt(700));
	}
	

private void goUp()
	{
		Tortoise.move(3);
	}

	private void goDown()
	{
		Tortoise.move(-3);
	}
	
	private void goLeft()
	{
		Tortoise.turn(-3);
	}

	private void goRight()
	{
		Tortoise.turn(3);
	}

	private void checkIfFoodFound() throws Exception
	{
		int tortoiseLocationX = Tortoise.getTurtle().getX();
		int tortoiseLocationY = Tortoise.getTurtle().getY();
		
		// 7. Print out the variables for tortoiseLocationX and tortoiseLocationY

		if(tortoiseLocationX == foodX && tortoiseLocationY == foodY){
			// print "chomp"
			Runtime.getRuntime().exec("say chomp");
			eatFood();
		}
		
	}

private void eatFood() {
		component.setText("");
		feedTheTortoise();
	}

	private void addFood(int x, int y)
	{
		component.setLocation(x, y);
		window.add(component);
		foodX = x;
		foodY = y;
	}

	TurtlePanel window = Tortoise.getBackgroundWindow();
Label component = new Label("#");

	public static void main(String[] args)
	{
		Move feeder = new Move();
		feeder.controlTheTortoise();
		feeder.feedTheTortoise();
	}

	private void controlTheTortoise() 
{
KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		Tortoise.show();
		Tortoise.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e)
	{
		if (e.getID() == KeyEvent.KEY_PRESSED)
		{
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				 goDown();
			try {
			checkIfFoodFound();
			} catch (Exception exception) {}
		}
		return false;
	}

}

