package task3_2;


// Вариант 3
public class Main {

	public static void main(String[] args) {
		
		MyRandomGenerator myGen = new MyRandomGenerator();
		RandomActions rAct = new RandomActions();
		Integer r1, r2, r3, res;

		
		
		r1 = myGen.generate(100, 999);
		r2 = myGen.generate(100, 999);
		r3 = myGen.generate(100, 999);
		
		
		System.out.println("Три случайных числа");
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		
		r1 = rAct.appendInt(r1, r2);		
		System.out.println("Результат склейки: " + r1);
		
		res = r1 - r3;
		System.out.println("Результат вычитания из слейки третьего числа: " + res);
		
	}

}
