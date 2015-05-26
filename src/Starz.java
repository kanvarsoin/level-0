
import java.awt.Color;

import org.teachingextensions.logo.Colors;
// Copyright Wintriss Technical Schools 2014
import org.teachingextensions.logo.Tortoise;

/*** Teacher's note ***/
/*
 * Start by reviewing the 3 pieces of a for loop (initialization, condition,
 * increment). Do not give the students the answer to the challenge. A solution
 * is printed in the red curriculum folder.
 */

public class Starz {

	public static void main(String[] args) {

		// 1. Set the X position of the Tortoise so that it starts on the left.
       Tortoise.setX(20);
       Tortoise.show();
		// 2. Make the Tortoise draw a star shape. Hint: 144.
       Tortoise.setSpeed(10);
       for (int i = 0; i < 47; i++) {
    	   Tortoise.setPenColor(Colors.getRandomColor()); 
    	   Tortoise.setX(20+i*40);
    	   
           for (int p = 0; p < 5; p++) {
        	   Tortoise.move(50);
               Tortoise.turn(144);
    	} 
	}

       
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the Tortoise draw a line of stars like this:
		 * http://postimg.org/image/40rsesa8h/
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}

	


