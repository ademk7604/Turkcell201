package d07_Constructor;

public class Ogrenci {
	
	String ad;
	String soyad;
	int yas;
	
	Ogrenci(){
		ad= "Bilinmiyor";
		soyad = "Bilinmiyor";
		yas = -1;
	}
	
	Ogrenci(String a, String b, int y) {
		ad= a;
		soyad= b;
		yas = y;
	}
	

}
