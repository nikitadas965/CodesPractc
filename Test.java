package food;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fruit f = new Fruit();
Tablet t = new Tablet();
//doShapes(f);
doShapes(t);
	}
	/** calls the nethod and displays its content, only thing is that, any forms of the superclass can 
	 * be passed .This is polymorphism */ 
	
	public static void doShapes(Tablet e)
	{
		e.displayShape();
		e.get();
	}

}
