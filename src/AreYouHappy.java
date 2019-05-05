import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("Are you happy?");
	if(answer.equalsIgnoreCase("Yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
	}
	else if(answer.equalsIgnoreCase("No")) {
String hapans = JOptionPane.showInputDialog("Do you want to be happy?");
if(hapans.equalsIgnoreCase("Yes")) {
	JOptionPane.showMessageDialog(null, "Change something");
}
if(hapans.equalsIgnoreCase("No")) {
	JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
}
	}

}
}
