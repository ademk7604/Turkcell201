package d28_LabSuperFinalThis;

public class YolcuTasimaAraci extends Arac {

	private int kapasitesi;

	public YolcuTasimaAraci(String marka, String plaka, int kapasitesi) {
		super(marka, plaka);
		this.kapasitesi = kapasitesi;
	}

	public int getYolcuKapasitesi() {
		return kapasitesi;
	}

	public void setYolcuKapasitesi(int kapasitesi) {
		this.kapasitesi = kapasitesi;
	}
	
	public void yazdir() {
		super.yazdir();
		System.out.println("Kapasite: "+kapasitesi);
	}

}
