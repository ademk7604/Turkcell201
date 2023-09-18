package d02_methodTanimlama;

import java.util.Scanner;

public class M01Driver {
	public static void merhaba() {
		System.out.println("Merhaba");
	}
	
	public int topla(int x, int y) {
		int toplam =x+y;
		return toplam;
	}
	
	public static void main(String[] args) {
		/*M01Driver m01Driver = new M01Driver();
		m01Driver.merhaba();
		*/
		// instance olmadan methoda ulasmak icin static yapmamiz gerekir
		merhaba();
		M01Driver m01Driver = new M01Driver();
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		
		int sonuc = m01Driver.topla(a,b);
		System.out.println(sonuc);
	}

}
