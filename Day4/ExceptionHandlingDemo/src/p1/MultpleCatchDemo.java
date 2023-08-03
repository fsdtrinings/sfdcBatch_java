package p1;

public class MultpleCatchDemo {
	
	public static void main(String[] args) {
		
		
		String arr[] = {"10","11","2"}; // 0-2
		arr = null;
		
		try {
			
			for (String data : arr) {
				
				int x = Integer.parseInt(data);
				
				int doubleValue = x*2;
				System.out.println(doubleValue);
				
				
			}//end of for ... after iteration of array
			
			int x = Integer.parseInt(arr[15]);
			
			int doubleValue = x*2;
			System.out.println(doubleValue);
			
			
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index not available \n "+e);
		}
		catch(NumberFormatException e)
		{
			System.out.println(" Cannot convert the String into number \n "+e);
			System.out.println(" concat to customer care or call 1800-00-745");
		}
		catch(NullPointerException e)
		{
			System.out.println("Array is Null");
		}
		finally {
			System.out.println(" finally block ");
		}
		
	}

}
