package d33_Overloading_MethodAsiriYukleme;

public class Student {

	private String kimlik;
	private String name;
	private String surname;
	private String sinif;

	public Student() {

	}

	public Student(String kimlik) {
		this.kimlik = kimlik;
	}

	public Student(String kimlik, String name) {
		this.kimlik = kimlik;
		this.name = name;
	}

	public Student(String kimlik, String name, String surname) {
		this.kimlik = kimlik;
		this.name = name;
		this.surname = surname;
	}

	public Student(String kimlik, String name, String surname, String sinif) {
		this.kimlik = kimlik;
		this.name = name;
		this.surname = surname;
		this.sinif = sinif;
	}

	public String getKimlik() {
		return kimlik;
	}

	public void setKimlik(String kimlik) {
		this.kimlik = kimlik;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSinif() {
		return sinif;
	}

	public void setSinif(String sinif) {
		this.sinif = sinif;
	}

}
