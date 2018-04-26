package task4_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class OrderModel {
	private BookStore books = new BookStore();
	private OrderStatus status;
	private int price = 0;
	private LocalDate date;
	
	
	
	
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	public void addToOrder() {
		
	}
	

	
	
}
