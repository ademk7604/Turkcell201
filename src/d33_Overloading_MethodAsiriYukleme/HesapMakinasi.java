package d33_Overloading_MethodAsiriYukleme;

public class HesapMakinasi {
	
	public int topla(int x, int y) {
		return x+y;
	}
	/*
	//** topla methodu cagirdiginda bur da hangi  metodu cagiracagini bilememekte cunki isim ve parametre sayisi ve sirasi ayni**
	// java geriye donus tiplerini mehodun imzasina dahil etmemistir.
	public float topla(int x, int y) {
		return x+y;
	} */
	
	public float topla(float x, float y) {
		return x+y;
	}
	
	public float topla(int x, float y) {
		return x+y;
	}
	
	public float topla(float x, int y) {
		return x+y;
	}

}
