package d15_PojoClass;

import java.util.Date;

public class Calisan {

	private String name;
	private double maas;
	private Date iseGirisTarihiDate;

	public void setName(String s) {
		name = s;
	}

	public String getName() {
		return name;
	}

	public void setMaas(double d) {
		maas = d;
	}

	public double getMaas() {
		return maas;
	}

	public void setIseGirisTarihi(Date d) {
		iseGirisTarihiDate = d;
	}

	public Date getIseGirisTarihi() {
		return iseGirisTarihiDate;
	}

}
