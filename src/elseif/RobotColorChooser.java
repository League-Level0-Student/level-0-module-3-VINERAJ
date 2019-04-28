//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot rob = new Robot();
		//3. Ask the user what color they would like the robot to draw
		for(int i=0;i<10;i++) {
		String answer = JOptionPane.showInputDialog("What color do you want the robot to draw in?");
		//5. Use an if/else statement to set the pen color that the user requested
        if(answer.equalsIgnoreCase("red")) {rob.setPenColor(200,0,0);}
        if(answer.equalsIgnoreCase("blue")) {rob.setPenColor(0,0,200);}
        if(answer.equalsIgnoreCase("green")) {rob.setPenColor(0,200,0);}
        //6. If the user doesn’t enter anything, choose a random color
        else {JOptionPane.showMessageDialog(null, "Your answer was not recognized");
        rob.setRandomPenColor();
        }
rob.penDown();
        
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		rob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
rob.setSpeed(200);
for(int j=0;j<6;j++) {
rob.turn(60);
rob.move(100);
}
rob.hide();

	}
	}
}
