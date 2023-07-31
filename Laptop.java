

class Laptop // Note 1:  class name and file HAVE TO BE SAME    , Laptop.java
{
    static int cost = 80000;
	static float screenSize = 15.5f; // by default java takes all real numbers as double not as float 
	   /* so by using f after 15.5 , u r telling java to take it as float*/
	
	int ramSize = 16;  // non-static 
	
	
	public static void main(String args[])
	{
		System.out.println(" This is laptop class ");
		System.out.println("Laptop Cost :- "+cost); // printf(); or cout<<"dfvdf";
		System.out.println("Screen Size :- "+screenSize);


		Laptop  dell = new Laptop(); // this is the object

		System.out.println("Ram Size :- "+dell.ramSize); // call ramSize through dell object

	}

}




