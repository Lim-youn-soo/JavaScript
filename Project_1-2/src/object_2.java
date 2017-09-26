// Pyramid 
import java.util.*;

public class object_2 {

	private int x, y;
	
	public static void main(String[] args) {
		object_2 object = new object_2();
		object.Set_x(object.Enter_x());
		object.Set_y(object.Enter_y());

		object.pyramid(object.Get_x(), object.Get_y());
	}

	public void Set_x(int a) {x=a;}
	public void Set_y(int b) {y=b;}
	public int Get_x() {return x;}
	public int Get_y() {return y;}
	
	public int Enter_x() {							// Enter the Height value
		int x = 0;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Please Enter the Number");
			try {
				x = scan.nextInt();
				
				if(x <= 0) {						// Exception Handle -> ZERO & Minus
					System.out.println("[Error]: Number Must be Positive");
					scan = new Scanner(System.in);
					continue;
				}
				break;
			}
			catch(InputMismatchException e) {		// Exception Handle -> Not Integer
				System.out.println("[Error]: Number Must be Positive");
				scan = new Scanner(System.in);
			}	
		}

		return x;
	}
	
	public int Enter_y() {						 // Enter the Multiple value
		int y = 0;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Please Enter X");
			try {
				y = scan.nextInt();
				
				if(y <= 0) {					// Exception Handle -> ZERO & Minus
					System.out.println("Error]: X Must be Positive");
					scan = new Scanner(System.in);
					continue;
				}
			
				break;
				
			}catch(InputMismatchException e) {  // Exception Handle -> Not Integer
				System.out.println("[Error]: X Must be Positive");
				scan = new Scanner(System.in);
			}
			
		}
		
		scan.close();
		return y;
	}
	
	
	public void pyramid(int height, int multiple) {			// Make Pyramid 
		int base = 0;
		
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < i+1; j++) {
			System.out.print(base+" ");
			base += multiple;
		    }
			System.out.println();
		}		
	}
}
