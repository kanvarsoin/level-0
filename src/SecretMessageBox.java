
					// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {
public static void main(String[] args) {
	    // 1. Set the passcode in a String variable
	    String i = "57859674967596759769487958y8586958450485y58483766837965749573947393894783yhfhdhejfhnshfnjsghhfgsndhdndhfnfhfndhdmndjudehrjdujfj";
		// 2. Using a pop-up, ask for a secret message and store it in a variable
        String Message = JOptionPane.showInputDialog("Write a secret message."); 
		// 3. Ask your friend for the passcode and store it in a variable
        String Great = JOptionPane.showInputDialog("What is the passcode?");
		// 4. If the passcode matches, show the secret message
        if (Great .equals (i)) {
			JOptionPane.showMessageDialog(null, " Your secret message is "+ Message);
		}else{JOptionPane.showMessageDialog(null, "INTRUDER!!!!!!!!!!!!!! ");}
		// 5. If the passcode does not match, pop-up "INTRUDER!!
      
}

}
