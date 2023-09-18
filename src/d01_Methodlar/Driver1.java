package d01_Methodlar;

import java.util.Scanner;

public class Driver1 {
public static void main(String[] args) {
	System.out.println("First Method");
	System.out.println(Math.pow(2, 3));
	System.out.println(Math.sqrt(16));
	
	Scanner scanner = new Scanner(System.in);
	
	String slmString = scanner.nextLine();
	System.out.println(slmString.toUpperCase());
	
}



}
