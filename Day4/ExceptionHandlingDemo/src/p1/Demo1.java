package p1;


class Dog{
	
	public void playGames()
	{
		System.out.println("Dog class - palyGames");
	}
}

public class Demo1 {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		
		System.out.println("A");
		try {
			d.playGames();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Code");
		}
		System.out.println("B");
		
	}
}
