package d44_TryCatchLabHatasinifiolusturma;

public class Driver {

	public static void main(String[] args) {
		Isci isci = new Isci();
		try {
			isci.setIsim("  ");
		} catch (HataliDeger e1) {
			System.out.println(e1.getMessage());
		}
		/*
		 * d44_TryCatchLabHatasinifiolusturma.HataliDeger: isim olamaz! at
		 * d44_TryCatchLabHatasinifiolusturma.Isci.setIsim(Isci.java:20) at
		 * d44_TryCatchLabHatasinifiolusturma.Driver.main(Driver.java:8) isim: null,
		 * maas: 2200.0 burda e1.printStackTrace(); daki bu koddan dolayi atti ama
		 * program calismaya devam ediyor
		 */

		try {
			isci.setMaas(2200);
		} catch (HataliDeger e) {
			System.out.println(e.getMessage());
		}
		System.out.println(isci);
	}

}
