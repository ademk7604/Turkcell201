package d07_Constructor;

public class Driver {
	
	int x;
	public Driver() {
		System.out.println("const");
		x=20;
	}
	
	public static void main(String[] args) {
		Driver driver = new Driver(); // aslinda public Driver() bu cons.  demek oluyor
		System.out.println(driver.x);
		
		Ogrenci ogrenci =new Ogrenci("Goktug", "Caliskan", 12);
		System.out.println(ogrenci.ad);
		System.out.println(ogrenci.soyad);
		System.out.println(ogrenci.yas);
		
		Ogrenci ogrenci2 = new Ogrenci();
		System.out.println(ogrenci2.ad);
		System.out.println(ogrenci2.soyad);
		System.out.println(ogrenci2.yas);
		
	}

}
