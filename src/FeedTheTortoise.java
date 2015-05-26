
// Copyright Wintriss Technical Schools 2013

import java.awt.Component;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Label;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.TurtlePanel;

public class FeedTheTortoise implements KeyEventDispatcher
{

	private void feedTheTortoise()
	{
		// 1. use the addFood() method to add food for the tortoise
		addFood(50,60);
	}

private void goUp()
	{
		// 2. Print “going up”. Test it out by running your code and pressing the up key
	
		// 3. Make the tortoise move up the screen
	    Tortoise.move(10);
	}

	private void goDown()
	{
		// 4. make the tortoise move down the screen
		Tortoise.turn(180);
		Tortoise.move(10);
		Tortoise.turn(-180);
	}
	
	private void goLeft()
	{
		// 5. make the tortoise move left 	}
        Tortoise.turn(-90);
        Tortoise.move(10);
		Tortoise.turn(90);
	}
	private void goRight()
	{
		// 6. make the tortoise move right
		Tortoise.turn(90);
		Tortoise.move(1);
		Tortoise.turn(90);
	}

	private void checkIfFoodFound() throws Exception
	{
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();
		
		// 7. Print out the variables for tortoiseLocationX and tortoiseLocationY
        System.out.println(tortoiseLocationX);
        System.out.println(tortoiseLocationY);
		// 8. if tortoise is at same location as food
        if (tortoiseLocationX == 50) {
		if (tortoiseLocationY == 60) {
	    JOptionPane.showMessageDialog(null,"Chomp");
		}
		}
			// print "chomp"
			// say “chomp” with Runtime.getRuntime().exec(“say chomp”);
			// call the eatFood() method
		
	}

private void eatFood() {
		component.setText("");
	}

	private void addFood(int x, int y)
	{
		component.setLocation(x, y);
		window.add(component);
	}

	TurtlePanel window = Tortoise.getBackgroundWindow();
Label component = new Label("*");

	public static void main(String[] args)
	{
		FeedTheTortoise feeder = new FeedTheTortoise();
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



