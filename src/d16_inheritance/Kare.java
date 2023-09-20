package d16_inheritance;

public class Kare extends Sekil{
	// sekil classindaki public methodlara bu class da sahip olur.
	// sekil deki private lara direk erisim yoktur
	
	private int kenarUzunlugu;
	
	public int getKenarUzunlugu() {
		return kenarUzunlugu;
	}
	public void setKenarUzunlugu(int uzunluk) {
		kenarUzunlugu=uzunluk;
	}
	/*public void alanHesapla() {
		System.out.println("Alan: "+ (kenarUzunlugu*kenarUzunlugu));
	}*/

}
