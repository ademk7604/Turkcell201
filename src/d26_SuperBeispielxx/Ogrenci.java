package d26_SuperBeispielxx;

public class Ogrenci extends Kisi {

	private int number;

	public Ogrenci(String n, int num) {
		super(n);
		number = num;
		// TODO Auto-generated constructor stub
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int num) {
		number = num;
	}

	public void ozet() {
		System.out.println("Ogrenci Numara: " + number);
		bilgileriYazdir();
	}

}
