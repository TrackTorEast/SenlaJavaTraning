package task3_3;

public class Track {
	protected int Length;
	protected String Genre, Name;
	
	
	
	public Track(int Length) {
		this.Length=Length;
		this.Genre="None";
		this.Name="None";
	}
	
	
	
	public int getLength() {
		return Length;
	}
	
	
	public String getName() {
		return Name;
	}

	
	public String getGenre() {
		return Genre;
	}
	

}
