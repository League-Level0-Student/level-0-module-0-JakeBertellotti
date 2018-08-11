import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot bb8 = new Robot("batman");
		bb8.setSpeed(100);
		bb8.setRandomPenColor();
		bb8.penDown();
		bb8.turn(90);
		bb8.move(200);
		bb8.turn(180);
		bb8.move(100);
		bb8.turn(270);
		bb8.move(200);
		bb8.turn(90);
		bb8.move(100);
		bb8.turn(90);
		bb8.move(50);
	}
}
