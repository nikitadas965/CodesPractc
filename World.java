package food;

public class World extends Hello {
	
	/*public World()
	{
		System.out.println("world");
	}
	public void display()
	{
		System.out.println("world");
	}
	public void display1()
	{
		System.out.println("Hi world");
	}
	
	public static void main(String[] args) {
		Hello hello = new World();
		hello.display1();
	}
*/
	public static void main(String[] args) {
		
		Hello hello = new Hello();
		World w  = (World) hello;
		
	}
	
	
}
