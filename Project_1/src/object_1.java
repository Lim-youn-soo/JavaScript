// Bubble Sorting 
import java.util.*; 

class object_1 {
	private ArrayList<Integer> arr = new ArrayList<Integer>(); 
	
	public static void main(String[] args) {
		object_1 object = new object_1();
		object.Setter(object.arr);			// Set the Sorting Values
		object.BubbleSort(object.arr);		// Bubble Sorting

	}
	
	public void Setter(ArrayList<Integer> arr) {			
		int length = 0;
		Scanner scan = new Scanner(System.in);	// For User's Input 
		
		while(true) {
			try {
				System.out.println("Please Set the Sorting Amount");
				length = scan.nextInt();		// User Enters Sorting Amount
				break;
			}catch(InputMismatchException e) {  // If User Enters not Integer -> Error
				System.out.println("[Error]: Array's Size Must be Integer");
				scan = new Scanner(System.in);  // Initialize Scanner -> If not, Infinite Loop
			}
		}
		
		System.out.println("Please Enter the Array's Value -> Array's Size is " + length);
		while(length != 0) {
			try {
				arr.add(scan.nextInt());	    // User Enters Sorting Values
				length--;
			}catch(InputMismatchException e){	// If User Enters not Integer -> Error
				System.out.println("[Error] : Array's Value Must be Integer");
				scan = new Scanner(System.in);	
			}
			
			
		}
		System.out.println("2012722070 ÀÓ¿¬¼ö");			// Print My Student Number & Name
		System.out.println("Array Before Bubble Sort");
		System.out.println(arr);						// Print Status Before Sorting
		scan.close();		
		
	}

	public void BubbleSort(ArrayList<Integer> arr) {
		System.out.println("Array After Bubble Sort");
		for(int i =0; i<arr.size(); i++) {			    // Bubble Sorting with Descending Order
			for(int j = 1; j < arr.size()-i; j++) {
				if(arr.get(j-1) < arr.get(j)) {
					Collections.swap(arr, j-1, j);
				}
			}
		}
		System.out.println(arr);						// Print Status After Sorting
	}
	

}

