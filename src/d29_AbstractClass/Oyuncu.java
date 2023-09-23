package d29_AbstractClass;

public abstract class Oyuncu {

	private String isim;
	private int number;

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public abstract void sutCek();
	
	public abstract void pasVer();

}
