// Find RightMost Number & Compare
import java.util.*;

public class object_4 {

	private int a,b,c;
	
	
	
	public static void main(String[] args) {
		object_4 object = new object_4();
		
		System.out.println("Enter the First Value");
		object.set_a(object.Enter(0));
		System.out.println("Enter the Second Value");
		object.set_b(object.Enter(1));
		System.out.println("Enter the Third Value");
		object.set_c(object.Enter(2));

		
		System.out.println(object.compare(object.get_a(), object.get_b(), object.get_c()));
		
		
	}
	
	public void set_a(int a) {this.a = a;}
	public void set_b(int b) {this.b = b;}
	public void set_c(int c) {this.c = c;}
	
	public int get_a() {return a;}
	public int get_b() {return b;}
	public int get_c() {return c;}
	
	public int Enter(int count) {			// User Enter Interface
		int x = 0;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		try {
		x = scan.nextInt();
		if(x < 0) {
			System.out.println("[Error]: Input Value Must be Non-negative");
			scan = new Scanner(System.in);
			continue;
		}
		break;
		}catch(InputMismatchException e) {
			System.out.println("[Error]: Input Value Must be Integer");
			scan = new Scanner(System.in);
		}
		
		}
		
		if(count == 2)				// For Scanner Method's Error
		scan.close();
		return x;
	}
	
	public boolean compare(int a, int b, int c){  
		int r_a = find_rightmost(a);
		int r_b = find_rightmost(b);
		int r_c = find_rightmost(c);
		
		if((r_a == r_b) || (r_b == r_c) || (r_a == r_c)) // If there are Equal Numbers at least One, Return true 
		return true;
	
		return false;
		
	}
	
	public int find_rightmost(int a) { // Find RightMost Number & Return 
		int remainder = a%10;		
		return remainder;
	}

}
