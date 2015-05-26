import javax.swing.JOptionPane;
public class xgeeks {
	
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
        String Andy = "INTELLIGENCE";
        String Savera = "Speed";
        String June = "LIGHTNING";
        String Toby = "WAR";
        String Kanvar = "WATER";
        String Andrew = "DEAD";
		// 2. Ask the user to enter a name. Store their answer in a variable.
      String Powers = JOptionPane.showInputDialog("Who's super power do you want to find out about?");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
      if (Powers.equals( "Andy")) {
  		JOptionPane.showMessageDialog(null, "Andy has the power of  "+ Andy);
        }
        if (Powers.equals( "June")) {
    		JOptionPane.showMessageDialog(null, "June has the power of "+ June);
        } 
        if (Powers.equals( "Toby")) {
      		JOptionPane.showMessageDialog(null, "Toby has the power of "+ Toby);
        }
        if (Powers.equals( "Kanvar")) {
    		JOptionPane.showMessageDialog(null, "Kanvar has the power of "+ Kanvar);
      }
        if (Powers.equals( "Andrew")) {
    		JOptionPane.showMessageDialog(null, "Andrew has the power of "+ Andrew);
      }
        if (Powers.equals( "Savera")) {
    		JOptionPane.showMessageDialog(null, "Savera has the power of "+ Savera);
      }
      }
	}
