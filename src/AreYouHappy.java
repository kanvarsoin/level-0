import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	

	String happy = JOptionPane.showInputDialog("Are you happy?");

if (happy.equalsIgnoreCase("Yes")) {
	JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
 }
if (happy.equalsIgnoreCase("No")) {
	String cool = JOptionPane.showInputDialog("Do you want to be happy?");
}
if (happy.equals("No")) {
	JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
}
if (happy.equals("Yes")) {
JOptionPane.showMessageDialog(null, "Change somthing.");
}
}
}
