package task3_1;

// Вариант 2
public class Main {
	
	static String[] smas = new String[5];
	
	
	/**
	 * Заполняет массив тестовыми значениями
	 */
	private static void fillmas() {	
		smas[0] = "one";
		smas[1] = "two";
		smas[2] = "three";
		smas[3] = "four";
		smas[4] = "five";
	}
	
	
	
	/**
	 * 
	 * @return возвращает самый длинный элемент массива
	 */
	private static String findMaxElem() {
		int index=0;
		int max=0;
		
		for ( int i=0; i<smas.length; i++  ) {
			if (smas[i].length()>max) { index=i; max = smas[i].length(); }
		}
		
		return smas[index];
	}

	
	
	
	public static void main(String[] args) {		
		fillmas();		
		System.out.println("Максимальная длинна у " + findMaxElem());
	}

}
