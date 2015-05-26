import javax.swing.JOptionPane;


public class Factorial {

	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog(((Object)"What number?"), new String());
		System.out.println(Integer.toString(factorial(Integer.parseInt(num))));
	}

	private static int factorial(int parseInt) {
		if(parseInt <= 1){
			return parseInt;
		}
		return parseInt * factorial(parseInt - 1);
	}

}
