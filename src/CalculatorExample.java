import java.util.Scanner;

public class CalculatorExample {

	public static void main(String[] args) {
		
		while(true) {
			double a,b, result;
			String str;
			Scanner scan = new Scanner(System.in);
			a = scan.nextDouble();
			str = scan.nextLine();
			b = scan.nextDouble();
			
			if(str.equals("+")) {
				result = Adder.add(a,b);
			}else if(str.equals("-")) {
				result = Subtracter.subtract(a,b);
				
			}else if(str.equals("*")) {
				result = Multiplyer.multiply(a,b);
			}else if(str.equals("/")) {
				result = Divider.divide(a,b);
			}
			
			System.out.println("°á°ú°ª"+result);
		}

	}

}
