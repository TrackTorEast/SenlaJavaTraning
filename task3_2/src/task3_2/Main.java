package task3_2;


// Вариант 3
public class Main {

	public static void main(String[] args) {
		
		
		int min = 100, max = 999; 
		Integer r1, r2, r3, res;
		String str = "";
		
		
		max -= min;
		r1 = (int) (Math.random() * ++max) + min;
		r2 = (int) (Math.random() * ++max) + min;
		r3 = (int) (Math.random() * ++max) + min;
		
		
		System.out.println("Три случайных числа");
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		
		str = r1.toString() + r2.toString();
		System.out.println("Результат склейки: " + str);
		
		r1 = Integer.parseInt(str);;
		res = r1 - r3;
		System.out.println("Результат вычитания из слейки третьего числа: " + res);
		
	}

}
