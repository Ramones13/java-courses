public class Calculate {
	public static void main(String[] args) {
		// йа типа начал изучать зачем то Java

		System.out.println("Hell the world!");

		double param1 = 0.0;

		int value1 = Integer.valueOf(args[0]);
		int value2 = Integer.valueOf(args[1]);

		int summ = value1 + value2;
		double poww = Math.pow(value1, value2);
		System.out.println("Sum = " + summ);
		System.out.println("Pow = " + poww);

	}
}