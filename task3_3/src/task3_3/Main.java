package task3_3;

public class Main {

	public static void main(String[] args) {
		
		Disk my_disk = new Disk();
		
		System.out.println("Общая длинна песен на диске " + my_disk.length());
		System.out.println("Общий жанр на диске " + my_disk.getGenre());

	}

}
