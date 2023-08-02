package p1;

public class Demo2 {

	public static void main(String[] args) {
		
		Demo2 obj = new Demo2();
		int arr[] = {15,14,10,30};
		
		int newarr[] = obj.doThings(arr);
		for (int i : newarr) {
			System.out.println(i);
		}
	}
	
	public int[] doThings(int[] arr)
	{
		// increase the value by 1 
		
		for(int i = 0;i<arr.length;i++)
		{
			int value = arr[i];
			arr[i] = value+1;
		}
		
		return arr;
	}
	
}
