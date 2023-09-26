package d36_MethodOverriding;

public class Driver {
	public static void main(String[] args) {
		
		Kisi kisi1 = new Kisi("1", "Tugrul CALISKAN");
		System.out.println(kisi1.toString());
		
		Kisi kisi2 = new Kisi("1", "Enes CALISKAN");
		System.out.println(kisi2.toString());
		
		System.out.println(kisi1 == kisi2); // referans degerlerini tutar
		System.out.println(kisi1.equals(kisi2)); // equals methodununu overrid edip istedigim gibi ayarladim
		
		
		
		
	}

}
