import java.util.scaner;

public class InteractRunner{
	public static void main(String[] args) {
		Scanner reader = new Scaner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")){
				System.out.println("Enter first value : ")
				String value1 = reader.next();
				System.out.println("Enter second value : ");
				String value2 = reader.next();
				calc.sum(Integer.valueOf(value1),Integer.valueOf(value2));
				System.out.println("Result : " + calc.getResult());
				calc.cleanResult();
			}
		}
	}
}