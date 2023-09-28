package d40_tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// try in icin ne kadar az kod olursa o kadar verimli olur scanner den bir hata olusmaz
		
		try {
			System.out.print("1. Sayiyi giriniz: ");
			int x = scanner.nextInt();
			System.out.print("2. sayisi giriniz: ");
			int y = scanner.nextInt();
			int sonuc = x/y;
			System.out.println("sonuc: "+sonuc);
		}catch (ArithmeticException exception) {
			System.out.println("0'a bolunemez");
		}catch (InputMismatchException exception) {
			System.out.println("Lutfen bir sayi giriniz");
		} finally{
			scanner.close();
			System.out.println("Finally");
		}
		System.out.println("Uygulama kapandi");
		
	}

}
