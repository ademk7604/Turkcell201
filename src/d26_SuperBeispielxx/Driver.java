package d26_SuperBeispielxx;

public class Driver {

	public static void main(String[] args) {

		Kisi kisi = new Kisi("Ali");
		System.out.println(kisi.getName());

		Ogrenci ogrenci = new Ogrenci("Goktug Yildirim", 2);
		System.out.println(ogrenci.getName());
		System.out.println(ogrenci.getNumber());
		ogrenci.ozet();
	}

}
