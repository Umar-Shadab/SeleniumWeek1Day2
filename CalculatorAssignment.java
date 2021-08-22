package Week1.Day2;

public class CalculatorAssignment {

	public int add(int num1, int num2, int num3 ) {
		int num4 = num1 + num2 + num3;
		return num4;
		}

	public int sub(int num1, int num2) {
		int num3 = num1 - num2;
		return num3;
		}

	public int mul(int num1, int num2) {
		int num3 = num1 * num2;
		return num3;
		}

	public int div(int num1, int num2) {
		int num3 = num1 / num2;
		return num3;
		}


	public static void main(String[] args) {
		
		CalculatorAssignment cal = new CalculatorAssignment();
		System.out.println(cal.add(2, 3, 4));
		System.out.println(cal.sub(85, 6));
		System.out.println(cal.mul(2, 35));
		System.out.println(cal.div(44, 8));
		
		
	}

}
