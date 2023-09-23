package d26_SuperBeispielxx;

public class Kisi {

	private String name;

	public Kisi(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public void bilgileriYazdir() {
		System.out.println("Kisi: " + name);
	}

}
