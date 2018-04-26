package task4_1;

import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		BookStore testBookStore = new BookStore();
		
		
		testBookStore.addBook("Test1", "Test desc 1", "Test author1", 200, 5, 1998, Month.APRIL, 20);
		testBookStore.addBook("Test2", "Test desc 2", "Test author2", 250, 1, 1998, Month.MARCH, 15);
		testBookStore.addBook("Test3", "Test desc 3", "Test author3", 100, 2, 1998, Month.JUNE, 10);
		testBookStore.addBook("Test4", "Test desc 4", "Test author4", 500, 10, 1998, Month.MAY, 2);
		
		
		
		
		
		// Strange tests
		ArrayList<BookModel> sorted = testBookStore.getBookListCopy();
		Comps testComps = new Comps();
		Collections.sort(sorted, testComps.PriceComparator());
		System.out.println(sorted.toString());
		
		
		System.out.println(testBookStore.getAllBooks());

	}
	

}
