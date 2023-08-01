package p1;

import java.util.Scanner; // Step1

public class UserInput {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); //step 2
		/*System.out.println("Enter the value for X :- ");
		int x = sc.nextInt(); // next int is a method use to read integer value
		System.out.println(x+x);
		*/
		System.out.println("---------Taking input as String ---------");
		// take all input as String 
		
		String strX = sc.nextLine(); //45
		int x = Integer.parseInt(strX);
		System.out.println(x+x); //4545
		
		String strF = sc.nextLine();
		float f = Float.parseFloat(strF);
		System.out.println(f+f); //4545
		
		
	
		
		
		
		
	}//main
	
}//end class
