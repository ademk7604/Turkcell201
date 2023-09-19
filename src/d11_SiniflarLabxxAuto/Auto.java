package d11_SiniflarLabxxAuto;

public class Auto {
	
	String marka;
	String model;
	Renk renk;
	Vites vites;
	
	boolean marsBas;
	
	void hareketEtsin(String anahtarTak) {
		System.out.println(anahtarTak);
		marsBas=true;
	}
	void yurusun() {
		if(marsBas) {
			System.out.println("Araba gidiyor");
		}else {
			System.out.println("Anahtari takmadan ve marsa basmadan gidemiyorum");
		}
	}
	
	void yakitDoldur() {
		marsBas=false;
		System.out.println("Arac durduruldu");
		System.out.println("yakit doldu");
		marsBas=true;
	}

}
