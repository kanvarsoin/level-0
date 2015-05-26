import javax.swing.JOptionPane;


public class GuessTheAnimal {
	public static void main(String[] args) {
		// Copyright Wintriss Technical Schools 2013
		// 1. ask user if it has 4 legs. if yes, it’s a pig if no, it’s a monkey (use JOptionPane.showConfirmDialog)
		String answer = JOptionPane.showInputDialog(null, "Does it have 4 legs?");
		if (answer.equals("Yes")){
			String answer2 = JOptionPane.showInputDialog(null, "Does it have stripes?");
			if (answer2.equals("Yes")){
			   JOptionPane.showMessageDialog(null,"It might be a Zebra");
			   
			}
			else{
				JOptionPane.showMessageDialog(null,"It might be a pig");
			}
		}
		else{
			String answer3 = JOptionPane.showInputDialog(null,"Does it have two legs?");
			if (answer3.equals("Yes")){
					String answer4 = JOptionPane.showInputDialog(null,"I's it covered in fur?");
					if(answer4.equals("Yes")){
						JOptionPane.showMessageDialog(null,"It might be a monkey");
					}
					else{
						JOptionPane.showMessageDialog(null,"It might be a bird");
					}
				}
			
		}
		// 2. add zebra, pig, monkey, bird,
		// 3. add fish and spider.

	}

}
