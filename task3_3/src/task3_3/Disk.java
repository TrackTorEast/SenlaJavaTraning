package task3_3;

public class Disk {
	
	final int MAX_COUNT = 5;
	
	private int Length;
	private String Genre;
	private Track[] test_disk = new Track[MAX_COUNT];
	private int track_count;
	
	
	
	public Disk() {
		this.Genre="";
		this.track_count=0;	
		//	
	}
	
	
	public void test_fill() {		
		add_track(100, "aaa", "Rock");
		add_track(100, "bbb", "Pop");
		add_track(100, "ccc", "Indie");
		add_track(100, "ddd", "Indie");
		add_track(100, "eee", "Rock");
	}
	
	
	
	public void add_track(int Length, String Name, String Genre) {
		
		if (track_count<MAX_COUNT)
		if (Genre.equals("Rock")) {
			test_disk[track_count] = new Track_Rock(Length, Name); 
			addGenre("Rock");
			track_count++;
			} else
		if (Genre.equals("Pop")) {
			test_disk[track_count] = new Track_Pop(Length, Name);
			addGenre("Pop");
			track_count++; 
			} else
		if (Genre.equals("Indie")) {
			test_disk[track_count] = new Track_Indie(Length, Name); 
			addGenre("Indie");
			track_count++; 
			} else
				System.out.println("Error in genre");
			
	}
	
	
	
	
	public void addGenre(String Genre) {		
		// Тут надо как-то избавиться от повторений
		this.Genre+= Genre;		
	}
	
	
	
	public int length() {
		int len=0;
		for (int i=0; i<track_count; i++) {
			len += test_disk[i].getLength();
		}
		return len;
	}
	

	
	public String getGenre() {	
		return Genre;
	}
	
	
	
	
}
