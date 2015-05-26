import java.awt.Color;

import org.teachingextensions.logo.Tortoise;


public class OlimpicRings {
public static void main(String[] args) {
	
	//This is Kanvar's first comment
	
	//First Blue Circle
	Tortoise.setY(65);
	Tortoise.setX(25);
	for (int i = 0; i < 361; i++) {
	Tortoise.setPenWidth(5);
	Tortoise.setSpeed(10);
	Tortoise.setPenColor(Color.blue);
	Tortoise.move(1);
	Tortoise.turn(1);
	}
	
	//Second Yellow Circle
	Tortoise.setX(85);
	Tortoise.setY(90);
	Tortoise.move(1);
	Tortoise.turn(1);
	
	for (int i = 0; i < 361; i++) {
		Tortoise.setPenWidth(5);
	Tortoise.setSpeed(10);
	Tortoise.setPenColor(Color.yellow);
	Tortoise.move(1);
	Tortoise.turn(1);
	}
	//Third Black Circle
	Tortoise.setX(150);
	Tortoise.setY(65);
	Tortoise.move(1);
	Tortoise.turn(1);
	
	for (int i = 0; i < 361; i++) {
		Tortoise.setPenWidth(5);
	Tortoise.setSpeed(10);
	Tortoise.setPenColor(Color.black);
	Tortoise.move(1);
	Tortoise.turn(1);
	}
	//Fourth Green Circle
	Tortoise.setX(220);
	Tortoise.setY(85);
	Tortoise.move(1);
	Tortoise.turn(1);
	
	for (int i = 0; i < 361; i++) {
		Tortoise.setPenWidth(5);
	Tortoise.setSpeed(10);
	Tortoise.setPenColor(Color.green);
	Tortoise.move(1);
	Tortoise.turn(1);
	}
	//Fifth Red Circle
	Tortoise.setX(275);
	Tortoise.setY(65);
	Tortoise.move(1);
	Tortoise.turn(1);
	
	for (int i = 0; i < 361; i++) {
		Tortoise.setPenWidth(5);
	Tortoise.setSpeed(10);
	Tortoise.setPenColor(Color.red);
	Tortoise.move(1);
	Tortoise.turn(1);
	}

}

}
