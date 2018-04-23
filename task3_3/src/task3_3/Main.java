package task3_3;

public class Main {

	public static void main(String[] args) {		
		
		Disk myDisk = new Disk();
		myDisk.test_fill(); // Заполняем тестовыми значениями	
		System.out.println("Общая длинна песен на диске " + myDisk.length());
		System.out.println("Общий жанр на диске " + myDisk.getGenre());

	}

}
