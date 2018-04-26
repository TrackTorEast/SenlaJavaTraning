package task4_1;

import java.util.Comparator;

public class Comps{

	
	public Comparator<BookModel> PriceComparator() {
		  return new Comparator<BookModel>() {
			  @Override
            public int compare(BookModel o1, BookModel o2) {
				  return (o1.getPrice() - o2.getPrice());
			  }
		  };
	  }
	
	
	public Comparator<BookModel> NameComparator() {
		  return new Comparator<BookModel>() {
			  @Override
			  public int compare(BookModel o1, BookModel o2) {		
				  return o1.getName().compareTo(o2.getName());
			  }
		  };
	  }
	
	
	
	public Comparator<BookModel> CountComparator() {
		  return new Comparator<BookModel>() {
			  @Override
			  public int compare(BookModel o1, BookModel o2) {		
				  return o1.getCount() - o2.getCount();
			  }
		  };
	  }
	
	
	
	
	
	
}
