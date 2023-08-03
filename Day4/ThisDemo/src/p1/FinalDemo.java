package p1;

final class AA
{
    public void aWork() {}	
}

class B // extends AA // error , becoz class AA is a final , cannot extends
{
	
}

class AAA 
{
	public final void someNewWork() {
		
	}
}

class BBB extends AAA
{
	/*
	 * @Override public void someNewWork() {
	 * 
	 * }
	 *  // cannot override the final method
	 */
}

public class FinalDemo {

	final int x = 10;
	public static void main(String[] args) {
		
	}
	
	public void doStuff()
	{
//		x++; // error , becoz x is a final variable , cannot change
		
	}
	
}//end class
