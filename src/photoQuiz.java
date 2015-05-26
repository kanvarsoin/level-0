
 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class photoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select �Copy Image URL�)
		String Photo = "http://th03.deviantart.net/fs71/PRE/i/2013/308/b/f/percy_jackson___bob_and_small_bob_by_golden_flute-d6szoul.png";
		// 2. create a variable of type "Component" that will hold your image
        Component Bob = createImage(Photo);
		// 3. use the "createImage()" method below to initialize your Component
        quizWindow.add(Bob);
		// 4. add the image to the quiz window
        
		// 5. call the pack() method on the quiz window
        quizWindow.pack();
		// 6. ask a question that relates to the image
       String Answer = JOptionPane.showInputDialog("Who is this?");
		// 7. print "CORRECT" if the user gave the right answer
        if (Answer.equals("Bob")) {
        JOptionPane.showMessageDialog(null, "CORRECT!");
        }
		// 8. print "INCORRECT" if the answer is wrong
        
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
        quizWindow.remove(Bob);
		// 10. find another image and create it

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}



