
public class ForLoop {
public static void main(String[] args) {
	for (int i = 0; i < 11; i++) {
		String numbers = " ";
		
		numbers = i + "";
		if (i==2||i==4||i==6||i==8||i==10) {
		 numbers = i + " EVEN"; 
		}

		System.out.println(numbers);
		
	}
	

}
}
