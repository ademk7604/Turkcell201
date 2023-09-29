package d44_TryCatchLabHatasinifiolusturma;

public class Isci {
	private String isim;
	private double maas;

	public String getIsim() {
		return isim;
	}

	/*
	 * Eger bir methodumuz checkException yani derleme zamaninda try-chatc icine
	 * alinmasi gereken bir exception firlatmasi gerekiyorsa frilatilan bu hatayi
	 * methodun skob parantezinin arkadisna eklememiz gerekir. Bunun icin throws
	 * kelimesi kullanilir ardindan firlatilacak hata sinifi. Boylece setIsim
	 * methodu hatali method firlattigi onceden belirlenmis olur
	 */
	public void setIsim(String isim) throws HataliDeger {
		if (isim == null || isim.trim().length() == 0) {
			throw new HataliDeger("isim", isim);
		} else {
			this.isim = isim;
		}
	}

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) throws HataliDeger {
		if (maas < 0) {
			throw new HataliDeger("maas", maas);
		} else {
			this.maas = maas;
		}
	}

	public String toString() {
		return "isim: " + isim + ", maas: " + maas;
	}

}
