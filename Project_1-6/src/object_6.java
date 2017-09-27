// Cutting Sentence 
import java.util.*;

public class object_6 {

	private String str; 
	public static void main(String[] args) {
		object_6 object = new object_6();
		object.Enter(object.str);
	}

	public String get_string() {return str;}
	
	
	public void Enter(String s) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter String");
		s = scan.nextLine();		// User Enters String 
		char x;
		int count = 0;				 
		
		System.out.println("2012722070 ÀÓ¿¬¼ö");		
		for(int i = 0; i<s.length();i++) {
			x = s.charAt(i);	// Convert String -> Char
			if(Character.isLetter(x) == true) { // If char is letter, Print	
				System.out.print(x);
				count = 0;					    // initialization 
			}
			else {
				if(count == 0)					// For Prevent Line-Change Overlapping   
				System.out.println();
				count++;
			}
			
		}
		scan.close();
	}
}
