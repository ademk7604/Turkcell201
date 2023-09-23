package d28_LabSuperFinalThis;

public class Arac {

	private String plaka;
	private String marka;
	
	public Arac(String marka, String plaka) {
		this.marka=marka;
		this.plaka=plaka;
	}

	public String getPlaka() {
		return plaka;
	}

	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	public void yazdir() {
		System.out.println("Plaka: " + plaka);
		System.out.println("Marka: "+ marka);
	}

}
