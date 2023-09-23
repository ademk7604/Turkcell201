package d28_LabSuperFinalThis;

public class YukTasimaAraci extends Arac {

	private int yukKapasitesi;

	public YukTasimaAraci(String plaka, String marka, int yukKapasitesi) {
		super(marka, plaka);
		this.yukKapasitesi=yukKapasitesi;
	}

	public int getYukKapasitesi() {
		return yukKapasitesi;
	}

	public void setYukKapasitesi(int yukKapasitesi) {
		this.yukKapasitesi = yukKapasitesi;
	}
	
	public void yazdir() {
		super.yazdir();
		System.out.println("YukKapasitesi: "+yukKapasitesi);
	}

}
