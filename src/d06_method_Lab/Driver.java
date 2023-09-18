package d06_method_Lab;

public class Driver {
	public static void main(String[] args) {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.isim = "Tugrul";
		ogrenci.yas = 8;
		
		Driver driver = new Driver();
		driver.ogrenciBilgielri(ogrenci);
		
		System.out.println(ogrenci.isim);
		System.out.println(ogrenci.yas);
	}
	
	public void ogrenciBilgielri(Ogrenci ogrenci) {
		ogrenci = new Ogrenci(); // bu sekilde yeni instance uretmis oluyorum degisiklikler burda korunmus oluyor
		ogrenci.isim = "Ertug";
		System.out.println(ogrenci.isim);
		System.out.println(ogrenci.yas);
	}

}
