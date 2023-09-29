package d42_ThrowLab;

public class HataliYaricap extends Exception {

	private double r;

	public HataliYaricap(double r) {
		this.r = r;
	}

	public void printError() {
		System.out.println("Yaricap: " + r + " gecersizdir");
	}

}
