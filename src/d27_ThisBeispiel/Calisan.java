package d27_ThisBeispiel;

import java.util.Date;

public class Calisan {

	private String isim;
	private double maas;
	private Date iseBaslamaTarihi;

	public Calisan() {
		this("Bilinmiyor", 0);
	}

	public Calisan(String isim) {
		this(isim, 0);
	}

	public Calisan(String isim, double maas) {
		this(isim, maas, null);
	}

	public Calisan(String isim, double maas, Date iseBaslamaTarihi) {
		this.isim = isim;
		this.maas = maas;
		this.iseBaslamaTarihi = iseBaslamaTarihi;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	// this.isim = sinifin icindeki isim esittir isim demis oluyoruz

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}

	public Date getIseBaslamaDate() {
		return iseBaslamaTarihi;
	}

	public void setIseBaslamaDate(Date iseBaslamaTarihi) {
		this.iseBaslamaTarihi = iseBaslamaTarihi;
	}

	public void yazdir() {
		System.out.println("isim: " + isim);
		System.out.println("Maas: " + maas);
		System.out.println("Ise Basalama Tarihi: " + iseBaslamaTarihi);
	}

}
