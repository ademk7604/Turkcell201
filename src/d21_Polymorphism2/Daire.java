package d21_Polymorphism2;

public class Daire extends Sekil {

	private int yaricap;

	public Daire(int y) {
		yaricap = y;
	}

	public int getYaricap() {
		return yaricap;
	}

	public void setYaricap(int y) {
		yaricap = y;
	}

	public void alan() {
		System.out.println("Yaricap Alan: " + (Math.PI * Math.pow(yaricap, 2)));
	}

}
