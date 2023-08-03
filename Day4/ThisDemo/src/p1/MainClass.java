package p1;

class A
{
	public void someWork()
	{
		System.out.println(this);
		someOtherWork();
		// or 
		this.someOtherWork();
	}
	public void someOtherWork()
	{
		System.out.println("inside some other work "+this);
	}
	@Override
	public String toString() {
		return "Hello this is class A";
	}
	
	

}


public class MainClass {

	public static void main(String[] args) {
		
		A obj = new A();
		System.out.println(obj); // hashcode
		obj.someWork();
		
	}
}
