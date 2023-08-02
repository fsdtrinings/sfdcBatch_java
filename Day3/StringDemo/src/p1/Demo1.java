package p1;

public class Demo1 {
	
	public static void main(String[] args) {
		
		String name = "Ramesh";
		name = name.concat(" Kumar");
		System.out.println(name);
// -------------------------------------------
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		boolean a = (s1 == s2);
		System.out.println(a);
		
		String s3 = new String("Hello");
		String s4 = new String("HELLO");
		
		boolean b = (s3 == s4);
		System.out.println(b);
		
	// -------------------------------------------	
		
		//  equals() 
		
		boolean c = s3.equals(s4);
		System.out.println(" Using equals :- "+c);
		
		boolean d = s3.equalsIgnoreCase(s4);
		System.out.println(" Using equals :- "+d);
		
		
		int x = s1.length();
		System.out.println("Length :- "+x);
		
		String s5 = "      abc  ";
		x = s5.length();
		System.out.println("Length of x5 :- "+x);
		
		s5 = s5.trim(); // remove the white spaces
		x = s5.length();
		System.out.println("Length of x5 after trim :- "+x);
		
		System.out.println("\n--------------------------\n");
		
		String s6 = "Hello My Name is Ramesh Kumar";
		char ch = s6.charAt(3);
		System.out.println(" char At :- "+ch);
		
		
		s6 = "0123456789";
		String subStr = s6.substring(7);
		System.out.println(subStr);
		
		subStr = s6.substring(5, 8); //567
		System.out.println(subStr);
		
		
		// -----------------------------------------
		
		System.out.println("\n");
		String msg = "Hello How are you";
		String arr[] = msg.split("o");
		for (String str : arr) {
			System.out.println(str);
		}
		
		
		
	}

}



















