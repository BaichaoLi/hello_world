//Fig. 2.1 Welcome.Java
//Text-printing program.

import java.util.Scanner;

public class Welcome
{
	//main method begins execution of Java
	public static void main(String[] args)
	{
		System.out.println("Welcome to Java Programming!");
		Scanner input = new Scanner(System.in);
		int number1;
		int number2;
		int sum;

		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		sum = number1 + number2;
		System.out.printf("Sum is %d\n", sum);

	}
}
