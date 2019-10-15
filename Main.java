package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Comparable_Movie> list = new ArrayList<>();
		list.add(new Comparable_Movie("abc",8.3,12));
		list.add(new Comparable_Movie("xyz",7.6,10));

		Collections.sort(list);

		for(Comparable_Movie movie : list)
		{
			System.out.println("by year,comparable:  "+ movie.getName()+" "+movie.getRating()+" "+movie.getYear());
			System.out.println();

		}

		RatingComparison r = new RatingComparison();

		NameCompare n = new NameCompare();

		// Sort by rating : (1) Create an object of ratingCompare 
		//                  (2) Call Collections.sort (3) Print Sorted list 
		
		Collections.sort(list,r);
		for(Comparable_Movie movie : list)
		{
			System.out.println("by rating: "+movie.getName()+" "+movie.getRating()+" "+movie.getYear());
			System.out.println();
		}
		
		Collections.sort(list,n);
		for(Comparable_Movie movie:list)
		{
			System.out.println("by name: "+movie.getName()+" "+movie.getRating()+" "+movie.getYear());
			System.out.println();
		}
		
		
		/*******IF YOU WANT TO DO 2 SORTING KEEPING A CONDITION******/
		/*class Checker implements Comparator<Player>{

    public int compare(Player p1, Player p2)
    {
        if(p1.score == p2.score)
        {
            return p1.name.compareTo(p2.name);
        }
        else
        {
           return p2.score - p1.score; DESCENDING ORDER
        }
    }
}*/



	}
}
