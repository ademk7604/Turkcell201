package d15_PojoClass;

import java.util.Date;

public class Driver {
	
	public static void main(String[] args) {
		
		Calisan calisan = new Calisan();
		calisan.setName("Ali Can");
		calisan.setMaas(2200);
		calisan.setIseGirisTarihi(new Date());
		
		System.out.println(calisan.getName());
		System.out.println(calisan.getMaas());
		System.out.println(calisan.getIseGirisTarihi());
		
	}

}
