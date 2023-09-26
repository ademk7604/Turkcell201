package d32_IntefaceLab1;

public class Driver {

	public static void main(String[] args) {

		Elma[] elmalar = new Elma[10];
		elmalar[0] = new Elma(30, "Kirmizi");
		elmalar[1] = new Elma(40, "Kirmizi");
		elmalar[2] = new Elma(50, "Yesil");
		elmalar[3] = new Elma(60, "Kirmizi");
		elmalar[4] = new Elma(70, "Yesil");
		elmalar[5] = new Elma(80, "Sari");
		elmalar[6] = new Elma(90, "Sari");
		elmalar[7] = new Elma(100, "Kirmizi");
		elmalar[8] = new Elma(35, "Yesil");
		elmalar[9] = new Elma(65, "Sari");

		/*
		 * renkFiltrele("Sari", elmalar); System.out.println("-----");
		 * agirlikFiltrele(50, elmalar); System.out.println("-----");
		 * agirlikFiltrele2(50, elmalar);
		 */
		// RenkFiltresi renkFiltresi = new RenkFiltresi();
		// filtrele(renkFiltresi, elmalar);
		// AgirlikFiltresi agirlikFiltresi = new AgirlikFiltresi();
		// filtrele(agirlikFiltresi, elmalar);
		ElmaFiltresi elmaFiltresi = new AgirlikFiltresi();
		filtrele(elmaFiltresi, elmalar);

	}

	public static void filtrele(ElmaFiltresi elmaFiltresi, Elma[] elmalar) {
		for (int i = 0; i < elmalar.length; i++) {
			Elma elma = elmalar[i];
			if (elmaFiltresi.filtrele(elma)) {
				System.out.println(elma.getAgirlik() + " " + elma.getRenk());
			}
		}
	}

	public static void renkFiltrele(String renk, Elma[] elmalar) {
		for (int i = 0; i < elmalar.length; i++) {
			Elma elma = elmalar[i];
			if (elma.getRenk().equals(renk)) {
				System.out.println(elma.getRenk() + " " + elma.getAgirlik());

			}
		}

	}

	public static void agirlikFiltrele(int agirlik, Elma[] elmalar) {
		for (int i = 0; i < elmalar.length; i++) {
			Elma elma = elmalar[i];
			if (elma.getAgirlik() >= agirlik) {
				System.out.println(elma.getRenk() + " " + elma.getAgirlik());

			}
		}
	}

	public static void agirlikFiltrele2(int agirlik, Elma[] elmalar) {
		for (int i = 0; i < elmalar.length; i++) {
			Elma elma = elmalar[i];
			if (elma.getAgirlik() < agirlik) {
				System.out.println(elma.getRenk() + " " + elma.getAgirlik());

			}
		}
	}
}
