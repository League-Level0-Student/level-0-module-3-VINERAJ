import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {
	Robot rob = new Robot();
String color = JOptionPane.showInputDialog("What color do you want to draw in?");
if(color.equalsIgnoreCase("blue")) {
	rob.setPenColor(Color.blue);
}
else if(color.equalsIgnoreCase("red")) {
	rob.setPenColor(Color.red);
}
String shape = JOptionPane.showInputDialog("What shape do you want to draw?");
if(shape.equalsIgnoreCase("Square")) {
	drawSquare(rob);
}
else if(shape.equalsIgnoreCase("Triangle")) {
	drawTriangle(rob);
}
else if(shape.equalsIgnoreCase("Circle")) {
	drawCircle(rob);
}
}
static void drawSquare(Robot rob) {
	rob.penDown();
	rob.setSpeed(100);
	for(int i=0;i<4;i++) {
	rob.move(100);
	rob.turn(90);
	rob.hide();
	}
}
static void drawTriangle(Robot rob) {
	rob.penDown();
	rob.setSpeed(100);
	for(int i=0;i<3;i++) {
	rob.move(100);
	rob.turn(120);
	}
	rob.hide();
}
static void drawCircle(Robot rob) {
	for(int i=0;i<360;i++) {
		rob.penDown();
		rob.setSpeed(100);
		rob.move(1);
		rob.turn(1);
		rob.hide();
	}
}
}
