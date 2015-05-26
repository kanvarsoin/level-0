import javax.swing.JOptionPane;


public class MadLib {
	public static void main(String[] args) {
		String B = JOptionPane.showInputDialog("I took my ____________ to the shop.");
		String S = JOptionPane.showInputDialog("I took my "+B+" to the shop. Then _________________ popped up out of no where!");
		JOptionPane.showInputDialog("I took my "+B+" to the shop. Then "+S+" popped up out of no where!I am your ______________!");
	}
}
