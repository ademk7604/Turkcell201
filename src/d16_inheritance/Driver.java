package d16_inheritance;

public class Driver {
	
	public static void main(String[] args) {
		//Sekil sekil = new Sekil();
		Kare kare = new Kare();
		kare.setPosX(10);
		kare.setPosY(10);
		kare.setRenk("sari");
		kare.setKenarUzunlugu(10);
		
		System.out.println(kare.getKenarUzunlugu());
		System.out.println(kare.getRenk());
				
		Dikdortgen dikdortgen = new Dikdortgen();
		dikdortgen.setYukseklik(10);
		dikdortgen.setUzunluk(5);
		dikdortgen.setPosX(20);
		dikdortgen.setPosY(30);
		dikdortgen.setRenk("Mavi");
		
		Daire daire = new Daire();
		daire.setPosX(30);
		daire.setPosY(40);
		daire.setRenk("Kirmizi");
		daire.setYaricap(5);
	}

}
