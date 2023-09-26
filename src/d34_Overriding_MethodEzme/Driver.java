package d34_Overriding_MethodEzme;

public class Driver {
	public static void main(String[] args) {
		
		Araba araba = new Araba("x marka","Y model",2022);
		System.out.println(araba.toString());
		
		araba.setMarka("Q Marka");
		System.out.println(araba.toString());
	}

}
