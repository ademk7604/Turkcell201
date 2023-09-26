package d34_Overriding_MethodEzme;

public class Araba {

	private String marka;
	private String model;
	private int yil;
	
	public Araba(String marka, String model, int yil) {
		this.marka=marka;
		this.model=model;
		this.yil=yil;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYil() {
		return yil;
	}

	public void setYil(int yil) {
		this.yil = yil;
	}
	// Object clasindan override ediliyor . methodu yazmadigimizda Driver da methodun adresi ni yazar
	@Override
	public String toString() {
		return "Marka: "+getMarka()+", Model: "+getModel()+", Yil: "+getYil();
	}

}
