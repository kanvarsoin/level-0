
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String K = JOptionPane.showInputDialog("Do you like bannanas!");
		//2. if they say no
			//tell them they are crazy 
			//and end quiz
	     if (K.equals("no")) {
		JOptionPane.showMessageDialog(null,"Your crazy!");	
			}
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
	if (K.equals("yes")) {
		String S =	JOptionPane.showInputDialog("What is your favorite hobby");
        JOptionPane.showMessageDialog(null,S+" It is much better with bananas!");
        
	}
	}

}



