package d44_TryCatchLabHatasinifiolusturma;

public class HataliDeger extends Exception{

	public HataliDeger(String degiskenAdi, Object deger) {
		super(degiskenAdi+" " + deger+ " olamaz!");
		
	}
	
	
}
