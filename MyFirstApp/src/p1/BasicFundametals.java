package p1;

public class BasicFundametals {

	public static void main(String[] args) {
		
		/*  To print the table of 5 from 1-10  */
		
		
		int number = 5;
		int r1 = 67;
		int r2 = 84;
	
		
		System.out.println("\n--------Using for Loop -----------------\n");
		
		for(int i=r1;i<r2;i++)
		{
			System.out.println(number+" * "+i+" = "+(number*i));
		}
		
		System.out.println("\n--------Using While Loop -----------------\n");
		
		while(r1<=r2)
		{
			System.out.println(number+" * "+r1+" = "+(number*r1));
			r1++;
		}
		
		System.out.println("\n--------Using do While Loop -----------------\n");
		
		do {
			System.out.println(number+" * "+r1+" = "+(number*r1));
			r1++;
		}while(r1<r2);
		
		
		
	}//end of main
	
	
}//end class
