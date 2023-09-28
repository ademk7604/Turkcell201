package d40_tryCatch;

import java.util.Scanner;

public class Driver2 {
	public static void main(String[] args) {
		
		int [] numbers= {0,1,2,3,4,};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen bir deger giriniz");
		int index = scanner.nextInt();
		if (index <= numbers.length && index > 0) {
			System.out.println(numbers[index]);
		} else {
			System.out.println("Yanlis index numarasi");
		}
		// If ile kontrol edebildigin yerde try catch ile kontrol edip uygulamayi yavaslatmaya gerek yok. 
		//cunku JVM de farkli islemlere tabi olur Try-Catch
		/*
		try {
			System.out.println(numbers[index]);
		} catch (Exception e) {
			System.out.println("Yanlis index numarasi");
		} finally {
			scanner.close();
		}*/
		
	}
	

}
