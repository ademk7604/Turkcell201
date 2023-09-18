package d01_Methodlar;

public class Method1 {

	private void methodAdem() {
		System.out.println("MethodA");
	}

	private int topla(int x, int y) {
		int tolam = x + y;
		return tolam;
	}
	
	private float topla(float x, int y) {
		float tolam = x + y;
		return (float) tolam;
	}
	private float topla(float x, float y) {
		float tolam = x + y;
		return (float) tolam;
	}
	private int topla(byte x, byte y) {
		int tolam = x + y;
		return tolam;
	}

	public static void main(String[] args) {
		new Method1().methodAdem();
		Method1 method1 = new Method1();
		int sonuc = method1.topla(20, 30);

		System.out.println(sonuc);
	}

}
