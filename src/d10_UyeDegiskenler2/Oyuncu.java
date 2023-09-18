package d10_UyeDegiskenler2;

public class Oyuncu {
	
	int saglik = 100;
	
	static int oyuncuSayisi = 0; // static yaptigimizda Driver da her olustuurulan instance icin bir oyuncu olusmuyor. 
	
	public Oyuncu() { //burasi 3 diye doner
		oyuncuSayisi++;
	}
	
	void oyuncuSayisi() {
		System.out.println(oyuncuSayisi);
	}
	
	void yasam() {
		saglik = 100;
	}
	void darbe() {
		saglik--;
	}

}
