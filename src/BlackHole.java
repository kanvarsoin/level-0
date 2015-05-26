import org.teachingextensions.logo.Tortoise;


public class BlackHole {
	  public static void main(String[] args) {
		   	 // TODO Set Tortoise speed to 10
		   	 Tortoise.setSpeed(10);
		   	 // TODO Set pen color to black
		   	 
		   	 // TODO Set pen width to 5
		   	 Tortoise.setPenWidth(5);
		   	 // TODO Call method drawHole()
		   	 drawHole();
		    }
		    
		    // TODO Complete drawHole()
		    public static void drawHole() {
		   	 // TODO Do the following 360 times:
		   	 for (int i = 0; i < 360; i++) {
		   		circle(0.5);
		   		Tortoise.move(i);
		   		Tortoise.turn(46);
			}
		   	 // TODO Call circle with the length 0.5
		   	 
		   	 // TODO Move the tortoise i
		   	
		   	 // TODO Turn the tortoise 46 degrees
		   	 
		    }
		    
		    
		    /**
		     * @param lengthOfSide is the length of side
		     */
		    public static void circle(double lengthOfSide){
		   	 // TODO Do the following 360 times
		   	 for (int i = 0; i < 360; i++) {
				Tortoise.move(lengthOfSide);
				Tortoise.turn(1);
			}
		   	 // TODO Move the tortoise lengthOfSide
		   	 
		   	 // TODO Turn the tortoise the smallest amount
		   	 
		    }

		}




