import javax.swing.JOptionPane;


public class RollerCoaster {
public static void main(String[] args) {
	String WE = JOptionPane.showInputDialog("How tall are you?");
	int A = Integer.parseInt(WE);
	if (4 < A){
		JOptionPane.showMessageDialog(null, "You may go on the ride!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	else {
	JOptionPane.showMessageDialog(null, "You may not go on the ride!!!!!!!!!!!!!!!!!!!!!");	
	}
}
}
