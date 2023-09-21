package d21_Polymorphism2;

public class Kare extends Sekil {

	private int kenarUzunlugu;

	public Kare(int u) {
		kenarUzunlugu = u;
		// bu constructor yani yapici methodu yazarak ilk nesne olusturuldugunda bu
		// deger alarak olusacak
	}

	public int getKenarUzunlugu() {
		return kenarUzunlugu;
	}

	public void setKenarUzunlugu(int u) {
		kenarUzunlugu = u;
	}

	public void alan() {
		System.out.println("Kare Alan: " + (Math.pow(kenarUzunlugu, 2)));
	}

}
