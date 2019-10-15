package ComparatorAndComparable;

import java.util.Comparator;

public class RatingComparison implements Comparator<Comparable_Movie>{

	@Override
	public int compare(Comparable_Movie m1, Comparable_Movie m2) {
		// TODO Auto-generated method stub
		if(m1.getRating() < m2.getRating())
			return -1;
		else if(m1.getRating() > m2.getRating())
			return 1;
		else
			return 0;
	}
	
	
	//asc order
	
	

}
