import java.util.Scanner;

public class InteractRunner{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			while (true)){
				//System.out.println("Enter first value : ");
				//String value1 = reader.next();
				//System.out.println("Enter second value : ");
				//String value2 = reader.next();
				ReadArguments();
				calc.sum(Integer.valueOf(arguments[0]),Integer.valueOf(arguments[1]));
				System.out.println("Result : " + calc.getResult());
				calc.cleanResult();
				System.out.println("Exit : y/n");
				exit = reader.next();
				if (exit.equals("y")) break;
			}
		} finally {
			reader.close();
		}
	}
	private static String[] arguments = new String[];
	//private static int argumentIndex = 0;
	public static void ReadArguments (){
		Scanner reader = new Scanner(System.in);
		int argumentIndex = 0;
		String NextRead = "+";
		while (NextRead.equals("+")){
			System.out.println("Enter " + (argumentIndex+1) + " value : ");
			arguments[argumentIndex++] = reader.next();
			System.out.println("for add one more argument enter symbol '+'");
			NextRead = reader.next();
		}
	}
}