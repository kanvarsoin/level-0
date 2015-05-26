
// Copyright Wintriss Technical Schools 2013
import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class ConditionalColorTortoise {
	public static void main(String[] args) {

		// 3. ask the user what color they would like the tortoise to draw
		String EasyTeam = JOptionPane
				.showInputDialog("What is your favorite color?");

		// 4. use an if/else statement to set the pen color that the user
		// requested
		Tortoise.setSpeed(10);
		if (EasyTeam.equals("red")) {
			Tortoise.setPenColor(Color.RED);
		}
		if (EasyTeam.equals("blue")) {
			Tortoise.setPenColor(Color.BLUE);
		}
		if (EasyTeam.equals("yellow")) {
			Tortoise.setPenColor(Color.yellow);
		}

		// 5. if the user doesn’t enter anything, choose a random color
		if (EasyTeam.equals("randomcolor")) {
			Tortoise.setPenColor(Colors.getRandomColor());
		}
		// 6. put a loop around your code so that you keep asking the user for
		// more colors & drawing them

		// 2. set the pen width to 10
		Tortoise.setPenWidth(10);
		// 1. make the tortoise draw a shape (this will take more than one line
		// of code)
		Tortoise.move(50);
		Tortoise.turn(50);
		Tortoise.move(50);
		Tortoise.turn(50);
		Tortoise.move(50);
		Tortoise.turn(50);
		Tortoise.move(50);
		Tortoise.turn(50);
		Tortoise.move(50);
		Tortoise.turn(50);
		Tortoise.move(50);
		Tortoise.turn(50);
		Tortoise.move(60);

	}
}
