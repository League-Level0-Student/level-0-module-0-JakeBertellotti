package strings_and_dialogs;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
	public static void main(String[] args) throws Exception {

		// 1. Make a new Robot
		Robot bb8 = new Robot("batman");

		// 3. Put the robot's pen down
		bb8.penDown();

		// 6. Make the robot move as fast as possible
		bb8.setSpeed(500);

		// 5. Do everything below here 4 times

		// 2. Move your robot 200 pixels
		for (int i = 0; i < 4; i++) {

			bb8.move(200);
			bb8.turn(90);
		}
		// 4. Turn the robot 90 degrees to the right (90 degrees)

	}
}
