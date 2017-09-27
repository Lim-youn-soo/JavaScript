// Swap the Array's Value
import java.util.*;

public class object_5 {
	
	private ArrayList<Integer> array = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		object_5 object = new object_5();
		object.Enter(object.get_array());	// Fill the Array
		System.out.println("Before Swap");
		System.out.println(object.get_array());	
		object.swap(object.get_array());	// Swap the Array
		System.out.println("After Swap");
		System.out.println(object.get_array());
	}

	public ArrayList<Integer> get_array(){return array;}
	
	public ArrayList<Integer> Enter(ArrayList<Integer> array){
		int length, x;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Size of Array");
		
		while(true) {	// Define The Size of Arrays
			try {
				length = scan.nextInt();
				if(length <= 0) {		// Array's size must be > 0
					System.out.println("[Error] : Size Must be Bigger than 0");
					scan = new Scanner(System.in);
					continue;
				}
				break;
				
			}catch(InputMismatchException e) {
				System.out.println("[Error] : Size Must be Integer");
				scan = new Scanner(System.in);
			}
			
		}
		
		while(length != 0) {	// Fill the Array's Values
			try {
				System.out.println("Enter the Array's Value");
				x = scan.nextInt();
				length--;
				array.add(x);
			}catch(InputMismatchException e) {
				System.out.println("[Error]: Array's value Must be Integer");
				scan = new Scanner(System.in);
			}
		}
			
		scan.close();
		return array;
	}
	
	public ArrayList<Integer> swap(ArrayList<Integer> array){
		Collections.swap(array, 0, array.size()-1);	// Using Collection.swap Method, Swapping the ArrayList's Value (first <-> Last)
		return array;
	}
	
}
