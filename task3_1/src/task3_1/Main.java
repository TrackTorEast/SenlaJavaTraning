package task3_1;

// ������� 2
public class Main {
	
	public static void main(String[] args) {
		String[] smas = new String[5];
		RandomMasThrower rmt = new RandomMasThrower();
		Finder myFinder = new Finder();
		smas=rmt.fillmas(smas);	
		System.out.println("������������ ������ � " + myFinder.findMaxElem(smas));
	}

}
