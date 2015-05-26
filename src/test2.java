import org.teachingextensions.logo.Tortoise;


public class test2 {
public static void main(String[] args) {
	Tortoise.setSpeed(10);
	for (int i = 0; i < 360 ; i++) {
		Tortoise.turn(1);
		Tortoise.move(1);
	}
}
}
