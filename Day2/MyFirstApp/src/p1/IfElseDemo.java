package p1;

public class IfElseDemo {

	public static void main(String[] args) {
		
		int x = 10;
		boolean b = false;
		
		boolean a = (x==10);  // !=  , < , > 
		
		System.out.println(" value of b before abc : - "+b);
		boolean abc = (b = true);
		System.out.println(" value of b after abc : - "+b);
		
		// && :- check both side 
		// || :-  check only only 
		
		
		boolean b2 = (x!=20) || (b != true);
		System.out.println("b2 := "+b2);
		
		
		
		
	}
}
