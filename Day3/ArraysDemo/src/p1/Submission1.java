package p1;

public class Submission1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Submission1 t1 = new Submission1();
		int arr[]= {3,5,10,14,17,20,23,28,30,36,40,47,50};
		
		System.out.println(" ---- Input Array -----\n");
		for (int i : arr) {
			System.out.print(i+", ");
		}
		
		
		int arr1[] = t1.getAllEvenValues(arr);
		
		System.out.println("\n---- All Even Values -----\n");
		for (int i : arr1) {
			if(i != 0)
				System.out.print(i+", ");
		}
		
		
		/*int arr2[] = t1.getAllOddValues(arr);
		System.out.println("The Odd Numbers in the array"+arr2);
		int arr3[] = t1.getAllValuesBetweenRange(arr, 3, 10);
		System.out.println("The Numbers between given range"+arr3);*/
	}
	
	public int[] getAllEvenValues(int[] a)
	{
		//int b[]=a;// b and z both are same
		int outputArray[] = new int[a.length]; // use to hold new even values
		  // drawback of array ... size have to be given during declaration , (List)
		
		int x = 0; // use to hold index of outputArray
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				outputArray[x] = a[i];
				x++;
			}
		}
		return outputArray; // output ....even values only
	}
	
	public int[] getAllOddValues(int[] c)
	{
		int d[]= c;
		for(int i=0;i<d.length;i++)
		{
			if(d[i]%2!=0)
			{
				//System.out.println("The Odd Numbers in the array");
				System.out.println(d[i]);
			}
		}
		return d;
	}
	
	public int[] getAllValuesBetweenRange(int[] arr,int r1,int r2)
	{
		int e[]=arr;
		for(int i=0;i<e.length;i++)
		{
			if(i==r1 && i<r2)
			{
				//System.out.println("The Numbers between given range");
				
				System.out.println(e[i]);
			}
		}
		return e;
		
	}

}
