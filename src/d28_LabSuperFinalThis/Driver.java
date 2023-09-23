package d28_LabSuperFinalThis;

public class Driver {

	public static void main(String[] args) {

		Arac arac = new Arac("IE 22", "BMW");
		arac.yazdir();
		System.out.println("---------");

		Araba araba = new Araba("Audi", "IN 2202", 4, 4);
		araba.yazdir();

	}

}
