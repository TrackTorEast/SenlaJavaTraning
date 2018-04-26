package task4_1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class BookStore {
	
	private ArrayList<BookModel> books = new ArrayList<BookModel>();
	
	
	public void addBook(String name, String description, String author, int price, int count, int year, Month month, int day) {
		BookModel book = new BookModel(name, description, author, price, count, LocalDate.of(year, Month.NOVEMBER, day));
		books.add(book);
	}
	
	
	public String getAllBooks() {	
		String out = "";
		for (int i=0; i<books.size(); i++) {
			out += books.get(i).toString() + "\n";			
		}
		return out;	
	}
	
	
	public ArrayList<BookModel> getBookListCopy() {
		return (ArrayList<BookModel>) books.clone();		
	}
	
	
	
	
	

}
