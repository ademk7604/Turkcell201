package d21_Polymorphism2;

public class Driver {

	public static void main(String[] args) {

		Sekil sekil1 = new Kare(3);
		sekil1.alan();

		Kare kare1 = new Kare(10);
		kare1.alan();

		Daire daire1 = new Daire(6);
		daire1.alan();

		Sekil dikdortgen1 = new Dikdortgen(4, 8);
		dikdortgen1.alan();
	}

}
