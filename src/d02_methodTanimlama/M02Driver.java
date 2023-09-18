package d02_methodTanimlama;

public class M02Driver {
	public static void main(String[] args) {
		HesapMakinasi hesapMakinasi = new HesapMakinasi();
		float toplama = hesapMakinasi.topla(4.0f, 6.0f);
		System.out.println(toplama);
		System.out.println(hesapMakinasi.cikar(6.0f, 2.0f));
		System.out.println(hesapMakinasi.carp(9.0f, 7.0f));
		System.out.println(hesapMakinasi.bol(9.0f, 2.0f));
		System.out.println(hesapMakinasi.kare(6));
		System.out.println(hesapMakinasi.karekok(9));
	}

}
