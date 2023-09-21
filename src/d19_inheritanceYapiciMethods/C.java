package d19_inheritanceYapiciMethods;

public class C extends B{
	
	public C(String text) {
		super("text"); // B(String text) vermem ile C sinifina parametresini vermeme ragmen B nin cons cagirmiyor onun icin super ile gondermem gerekir
		// super const cagrilan ilk satirda olmali. parent cagriliyor
		System.out.println("C const");
	}

}
