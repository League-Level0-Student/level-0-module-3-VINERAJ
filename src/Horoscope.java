import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
String starsign = JOptionPane.showInputDialog("What is your star sign?");
  if(starsign.equalsIgnoreCase("Aquarius")) {
	JOptionPane.showMessageDialog(null, "You are going to drown in the mouth of a whale shark");
}
  else if(starsign.equalsIgnoreCase("Pisces")) {
	  JOptionPane.showMessageDialog(null, "You will die at 90 years old of a heart attack while swimming with dolphins");
  }
  else if(starsign.equalsIgnoreCase("Aries")) {
	  JOptionPane.showMessageDialog(null, "You will be thrown of a cliff by a charging goat, but you will survive");
  }
  else if(starsign.equalsIgnoreCase("Taurus")) {
	  JOptionPane.showMessageDialog(null, "You will join the rodeo, and you will die on your first day");
  }
  else if(starsign.equalsIgnoreCase("Gemini")) {
	JOptionPane.showMessageDialog(null, "You will be killed by your twin"); 
  }
  else if(starsign.equalsIgnoreCase("Cancer")) {
	  JOptionPane.showMessageDialog(null, "You will die of cancer");
  }
  else if(starsign.equalsIgnoreCase("Leo")) {
	  JOptionPane.showMessageDialog(null, "You will be killed by a male lion");
  }
  else if(starsign.equalsIgnoreCase("Virgo")) {
	  JOptionPane.showMessageDialog(null, "You will be killed by a serial killer");
  }
  else if(starsign.equalsIgnoreCase("Libra")) {
	  JOptionPane.showMessageDialog(null, "You will be killed in a library");
  }
  else if(starsign.equalsIgnoreCase("Scorpio")) {
	  JOptionPane.showMessageDialog(null, "You will be stung by a scorpion and die");
  }
  else if(starsign.equalsIgnoreCase("Sagittarius")) {
	  JOptionPane.showMessageDialog(null, "You will be shot with an arrow");
  }
  else if(starsign.equalsIgnoreCase("Capricorn")) {
	  JOptionPane.showMessageDialog(null, "You will be pushed of a mountain by Carl the llama");
  }
  else {
	  JOptionPane.showMessageDialog(null, "That's not a star sign!");
  }
}
}
