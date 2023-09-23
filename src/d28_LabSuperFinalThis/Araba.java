package d28_LabSuperFinalThis;

public class Araba extends YolcuTasimaAraci {

	private int kapiSayisi;

	public Araba(String marka, String plaka, int kapasite, int kapiSayisi) {
		super(marka, plaka, kapasite);
		this.kapiSayisi = kapasite;
	}

	public int getKapiSayisi() {
		return kapiSayisi;
	}

	public void setKapiSayisi(int kapiSayisi) {
		this.kapiSayisi = kapiSayisi;
	}
	
	public void yazdir() {
		super.yazdir();
		System.out.println("KapiSayisi: "+kapiSayisi);
	}

}
