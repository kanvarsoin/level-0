import org.teachingextensions.logo.Tortoise;


public class Koch {

	public static void main(String[] args) {
		Tortoise.turn(90);
		Tortoise.setSpeed(10);
		d(4, 243);
	}

	private static void d(int i, int j) {
		if(i == 1){
			Tortoise.move(j);
			return;
		}
		d(i - 1, j / 3);
		Tortoise.turn(-60);
		d(i - 1, j / 3);
		Tortoise.turn(120);
		d(i - 1, j/3);
		Tortoise.turn(-60);
		d(i - 1, j / 3);
	}

}
