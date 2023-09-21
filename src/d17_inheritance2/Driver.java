package d17_inheritance2;

public class Driver {
	
	public static void main(String[] args) {
		NakliyeAuto nakliyeAuto = new NakliyeAuto();
		nakliyeAuto.setUretici("X Marka");
		nakliyeAuto.setYukKapasitesi(20);
		
		Tir tir = new Tir();
		tir.setUretici("Y Marka");
		tir.setYukKapasitesi(20);
		tir.setKonteynirSayisi(2);
		System.out.println(tir.getKonteynirSayisi());
		
	}

}
