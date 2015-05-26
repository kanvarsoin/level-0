
import java.awt.Color;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TriangleShell {

	public static void main(String[] args) {
		
		Tortoise.setOrientation(960,500,0);
		// 5. Make the tortoise go as fast as possible
		Tortoise.setSpeed(100000);
		// 3. make a variable to hold the length of the triangle and set it to 25
		int lengthOfTheTriangle = 60;
		
		// 6. Do the following 60 time
		for (int i = 0; i < 111122222; i++) {
			Tortoise.setPenColor(Color.gray);
			drawTriangle(lengthOfTheTriangle);
			lengthOfTheTriangle = lengthOfTheTriangle+4;
			Tortoise.turn(6);
		}
		// 8. Change the color of the line the tortoise draws to a random color
		// 7. Increase the length of the side by 4 pixels
		
		// 4. call your drawTriangle() method using your length variable
		drawTriangle(lengthOfTheTriangle);
		// 9. Turn the tortoise 6 degrees to the right
		
	}

	/* 1. fill in the method below to draw a triangle. the triangle should be of size length. */

	private static void drawTriangle(int length) {
		Tortoise.turn(30);
		Tortoise.move(length);
		Tortoise.turn(120);
		Tortoise.move(length);
		Tortoise.turn(120);
		Tortoise.move(length);
	}
}


