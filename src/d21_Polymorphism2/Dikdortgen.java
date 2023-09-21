package d21_Polymorphism2;

public class Dikdortgen extends Sekil {

	private int genislik;
	private int yukseklik;

	public Dikdortgen(int g, int y) {
		genislik = g;
		yukseklik = y;
	}

	public int getGenislik() {
		return genislik;
	}

	public int getYukseklik() {
		return yukseklik;
	}

	public void setGenislik(int g) {
		yukseklik = g;
	}

	public void setYukseklik(int y) {
		yukseklik = y;
	}

	public void alan() {
		System.out.println("Dikdortgen Alan: " + (genislik * yukseklik));
	}

}
