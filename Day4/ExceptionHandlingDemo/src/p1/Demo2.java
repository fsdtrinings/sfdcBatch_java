package p1;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		//arrayRelatedException();
		numberFormatException();
		
	}
	
	
	public static void numberFormatException()
	{
		System.out.println("A");
		int x = Integer.parseInt("ten");
		System.out.println("B");
	}
	
	
	
	
	
	public static void arrayRelatedException()
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3]; //0-2
		
		
		System.out.println("Enter the Starting point of For Loop");
		for(int i=sc.nextInt();true;i++)
		{
			System.out.println("Enter Value for index :- "+i);
			try {
				arr[i] = sc.nextInt();
			}
			catch(Exception e)
			{
				System.out.println(i+" out of Range ");
				System.out.println("Enter the value for i again ");
				i = sc.nextInt();
				
			}
			
		}
	}
}
