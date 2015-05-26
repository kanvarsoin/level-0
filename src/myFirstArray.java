

public class myFirstArray {
	public static void main(String[] args) throws Exception {

        // 1. Declare array of Strings 
        String[] List;
        // 2. Allocates memory for 5 student names 
        List = new String[6];
        List[1] = "Kanvar";
        List[2] = "Jack";
        List[3] = "Shiva";
        List[4] = "Toby";
        List[5] = "Andrew";
        // 3. Assign first element of array to your name. 
        
        // 5. Assign the next few elements to the names of the rest of your class
        
        // 6. Set up a loop to print every name
        for (int i = 1; i < 6
        		; i++) {
			System.out.println(List[i]);
		}
               // 4. Print name 
        System.out.print(List[1]);
        
        
	}
}


