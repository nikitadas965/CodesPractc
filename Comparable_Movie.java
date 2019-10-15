package ComparatorAndComparable;

public class Comparable_Movie implements Comparable<Comparable_Movie>{
	// want to sort movie names according to the release year
	
	private double rating;
	private String name;
	private int year;
	
	public Comparable_Movie(String nam,double ratin,int yer)
	{
		this.name=nam;
		this.year=yer;
		this.rating=ratin;
	}
	
	


	public double getRating() {
		return rating;
	}



	public String getName() {
		return name;
	}








	public int getYear() {
		return year;
	}




// comparable sorts in natural sorting order
	// compareTo can be called only once
	// if you want to apply sorting more than once, use comparator



	// sorting movies by year
	public int compareTo(Comparable_Movie m) {
		// TODO Auto-generated method stub
		return this.year - m.year;
		
		// asc order
	}

}
