// Sum of Pair of Dice 

public class object_3 {
	
	public static void main(String[] args) {
		object_3 object = new object_3();
		object.Rolling();
	}
	
	public void Rolling() {
		int x, y, sum;
		
		x= (int)(Math.random()*6)+1;				// Rolling First Dice -> Range 1~6
		
		System.out.println("The First Dice comes up " + x);
		
		y = (int)(Math.random()*6)+1;				// Rolling Second Dice -> Range 1~6
		
		System.out.println("The Second Dice comes up " + y);
		
		sum = x+y;
		
		System.out.println("Your Total Roll is " + sum);	// Print Sum of Pair of Dice's value
	}

}
