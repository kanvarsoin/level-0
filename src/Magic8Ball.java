


// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 0. Make a main method that includes all the steps below….
    public static void main(String[] args) {
    	 int number = 29;
	
	// 1. Make a variable that will hold a random number
    
	// 2. Put a random number into this variable using "new Random().nextInt(4)"
    	number= new Random().nextInt(4);
	// 3. Print out this variable
    System.out.println(number);
	// 4. Get the user to enter a question for the 8 ball
    JOptionPane.showInputDialog("Ask a Yes, No, Maybe and never questions ?");
	// 5. If the random number is 0
if (number==0) {JOptionPane.showMessageDialog(null,"Yes");
	
}
	// -- tell the user "Yes"

	// 6. If the random number is 1
    if (number==1) {JOptionPane.showMessageDialog(null,"No");
		
	}
	// -- tell the user "No"

	// 7. If the random number is 2
    if (number==2) {JOptionPane.showMessageDialog(null,"Maybe");
		
	}
	// -- tell the user "Maybe?"

	// 8. If the random number is 3
    if (number==3) {JOptionPane.showMessageDialog(null,"never");		
	}
	// -- write your own answer
    }}


