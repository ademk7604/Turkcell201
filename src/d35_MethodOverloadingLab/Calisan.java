package d35_MethodOverloadingLab;

import java.util.Date;

public class Calisan {

	private String isim;
	private String bolum;
	private Date iseGirisTarihi;
	
	public Calisan() {
		
	}
	public Calisan(String bolum) {
		this.bolum = bolum;
	}
	public Calisan( String bolum, String isim) {
		this.isim = isim;
		this.bolum = bolum;
	}

	public Calisan(String isim, String bolum, Date iseGirisTarihi) {
		this.isim = isim;
		this.bolum = bolum;
		this.iseGirisTarihi = iseGirisTarihi;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public Date getIseGirisTarihi() {
		return iseGirisTarihi;
	}
	public void setIseGriisTarihi(Date iseGirisTarihi) {
		this.iseGirisTarihi=iseGirisTarihi;
	}
	
	public void bilgileriYazdir() {
		System.out.println("Isim: "+ isim);
		System.out.println("Bolum: "+bolum);
		System.out.println("Ise Giris Tarihi: "+iseGirisTarihi);
		System.out.println("------");
	}
	
	

}
