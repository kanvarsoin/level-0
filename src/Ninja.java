import org.teachingextensions.logo.Tortoise;


public class Ninja {

	public static void main(String[] args) {
		Tortoise.turn(90);
		Tortoise.setSpeed(10);
		d(2, 243);
	}

	private static void d(int i, int j) {
		if(i == 1){
			Tortoise.move(j);
			return;
		}
		d(i - 1, j / 3);
		Tortoise.turn(-90);
		d(i - 1, j / 3);
		Tortoise.turn(90);
		d(i - 1, j/3);
		Tortoise.turn(90);
		d(i - 1, j / 3);
		Tortoise.turn(-90);
		d(i - 1, j / 3);
	}

}
