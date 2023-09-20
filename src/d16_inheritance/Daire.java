package d16_inheritance;

public class Daire extends Sekil{

	private int yaricap;
	
	public int getYaricap() {
		return yaricap;
	}
	public void setYaricap(int _yaricap) {
		yaricap=_yaricap;
	}
	public void alanHesapla() {
		System.out.println("Daire Alan: "+(Math.PI*yaricap*yaricap));
	}
}
