package task3_1;

public class Finder {
	
	
	
	/**
	 * 
	 * @return ���������� ����� ������� ������� �������
	 */
	public String findMaxElem(String[] smas) {
		int index=0;
		int max=0;
		
		for ( int i=0; i<smas.length; i++  ) {
			if (smas[i].length()>max) { index=i; max = smas[i].length(); }
		}
		
		return smas[index];
	}

}
