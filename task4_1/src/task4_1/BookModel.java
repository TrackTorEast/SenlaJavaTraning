package task4_1;

import java.time.LocalDate;


public class BookModel {
	
	private String name;          // название
	private String description;  // описание
	private String author;      // автор
	private int price;         // цена
	private int count;        // наличие на складе
	private LocalDate date;          // дата издания
	
	
	
	
	
	
	
	
	public BookModel(String name, String description, String author, int price, int count, LocalDate date) {
		this.name = name;
		this.description = description;
		this.author = author;
		this.price = price;
		this.count = count;
		this.date= date;
	}
		
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	
	
	@Override
    public String toString() {
        return "[name=" + this.name + ", desc=" + this.description + 
        		", author=" + this.author + ", price=" + this.price + 
        		", count=" + this.count + ", date=" +this.date + "]";
    }
	
	
	

}
