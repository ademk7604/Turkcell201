package d39_ExceptionHandling1;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {

		// inputMismatchExcep();
		// arithmeticException();
		// arrayExcep();
		nullPointer();

	} 
	public static void inputMismatchExcep() {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(number); // a girdigimde sayi olmadigi icin java.util.InputMismatchException

	}

	public static void nullPointer() {
		Scanner scanner = null;
		String line = scanner.nextLine();
		System.out.println(line); // java.lang.NullPointerException:

	}

	public static void arrayExcep() {
		int[] numbers = { 0, 1, 2, 3, 4 };
		Scanner scanner = new Scanner(System.in);
		int index = scanner.nextInt(); // 5 = java.lang.ArrayIndexOutOfBoundsException
		System.out.println(numbers[index]);
	}

	public static void arithmeticException() {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt(); // y=0 java.lang.ArithmeticException:

		System.out.println(x / y);
	}
	

}
