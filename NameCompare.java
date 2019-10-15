package ComparatorAndComparable;

import java.util.Comparator;

public class NameCompare implements Comparator<Comparable_Movie> {

	@Override
	public int compare(Comparable_Movie o1, Comparable_Movie o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
