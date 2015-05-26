
//Copyright Wintriss Technical Schools 2013
import java.awt.Color;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class StarShow {

	public static void main(String[] args) {
		//4. delete this line and show the Tortoise
		
		// 13. Set the speed to 8
		Tortoise.setSpeed(1000);
		// 5. Make a variable to hold the X position of the Tortoise and set it to 10
		int x=10;
		// 6. Make a variable to hold the Y position of the Tortoise and set it to 440
		int y=440;
		// 7. Make a variable to hold the star size and set it to 15
		int starSize=800;
		// 11. Repeat steps 8 through 17, 30 times
		for (int i = 0; i <30; i++) {
			
		
			// 9. Set the X position of the Tortoise to your variable
			Tortoise.setOrientation(x, y, 0);
			// 10. Set the Y position of the Tortoise to your variable
			
			// 17. Set the pen color to random
			Tortoise.setPenColor(Color.magenta);
			// 8. Call the drawStar() method with your star size variable
			drawStar(starSize);
			// 12. increase the X position by star size
            x = x+starSize;
			// 14. decrease the Y position by star size
	        y = y-starSize;
			// 15. increase the star size by 8
			starSize = starSize+8;
			// 16. Turn the Tortoise 10 degrees
			Tortoise.turn(10);
		}
		
	}

	private static void drawStar(int length) {
		Tortoise.setOrientation(930, 500, 0);
		
		// 3. Repeat those 2 commands 5 times
	    for (int i = 0; i < 5; i++) {
	    	// 1. Move the Tortoise the distance of the starSize parameter
			Tortoise.move(length);
				// 2. Turn the Tortoise 144 degrees
	         Tortoise.turn(144);
		}
			
	}
}
