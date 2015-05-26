	import javax.swing.JOptionPane;
public class SecretMessage {
	// Copyright Wintriss Technical Schools 2013


	/**
	 * Secure Messaging System
	 * 
	 * You want to leave a message on one of the Mac computers so that only your friends can read it.
	 * 
	 * Toolbox: String variables, main() method, JOptionPane.showInputDialog, JOptionPane.showMessageDialog, String.equals, if statement
	 */

public static void main(String[] args) {
	// 1. Ask for an initial password, and store it in a variable
    String answer1 = JOptionPane.showInputDialog(null, "What is the secret message?"); 
	// 2. Ask for a message and store it in a variable
    String answer2 = JOptionPane.showInputDialog(null, "What is your password?");
	// 3. Ask your friend for the password and store it in a variable
    String answer3 = JOptionPane.showInputDialog("Do you know the password?");
	// 4. If the password matches,
    if (answer1.equals(answer3))
    {
	JOptionPane.showMessageDialog(null, "" + answer2);	
	}
    else
    {
    	JOptionPane.showMessageDialog(null, "Your wrong.");
    }
		// show the secret message
	// *5. OPTIONAL: let your friend keep guessing even if they are wrong

}

		
	}


