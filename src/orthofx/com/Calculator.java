package orthofx.com;

import java.util.Scanner;

class Calculator {

	public static void main(String[] args) {

		char operator;
		int number1, number2, result;

		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Choose an operator: +, -, *, or /");
			operator = input.next().charAt(0);
			System.out.println("Enter first number");
			number1 = input.nextInt();
			System.out.println("Enter second number");
			number2 = input.nextInt();

			switch (operator) {

			case '+':
				result = number1 + number2;
				System.out.println(number1 + " + " + number2 + " = " + result);
				break;

			case '-':
				result = number1 - number2;
				System.out.println(number1 + " - " + number2 + " = " + result);
				break;

			case '*':
				result = number1 * number2;
				System.out.println(number1 + " * " + number2 + " = " + result);
				break;

			case '/':
				try {
					result = number1 / number2;
					throw new Exception();
				} catch (ArithmeticException e) {

					System.out.println("cannot divide by zero");
				}
				break;

			default:                            
				
			}
		} finally {
			System.out.println("closing input");
			input.close();
		}

	}
}