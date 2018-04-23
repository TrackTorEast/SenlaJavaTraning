package task3_2;

public class MyRandomGenerator {
	
	public Integer generate(int min, int max) {	
		int out=0;
		max -= min;
		out = (int) (Math.random() * ++max) + min;		
		return out;
	}

}
