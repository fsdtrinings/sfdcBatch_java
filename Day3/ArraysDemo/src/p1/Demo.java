package p1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int arr[] = new int[5]; // 1-5 , 0-4
			
		//  ---- for loop use to insert the values 
			for(int i = 0;i<5;i++)
			{
				System.out.println("Enter Value for "+i+"th index");
				arr[i] = sc.nextInt(); // 
			}
			
		//  ---- for loop use to read the values 
			for(int i = 0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
			
			System.out.println("\n\n");
			
			for (int x : arr) {
				System.out.println(x);
			}
			
		
		
	}
}











