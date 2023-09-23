package d29_AbstractClass;

public class Driver {

	public static void main(String[] args) {

		Oyuncu oyuncu = new Basketbolcu();
		oyuncu.setIsim("JonasEkrem");
		oyuncu.setNumber(22);
		oyuncu.pasVer();
		oyuncu.sutCek();
		System.out.println(oyuncu.getIsim());
		System.out.println(oyuncu.getNumber());
		
	}

}
