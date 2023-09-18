package d08_ClassAndObject;

public class Driver {
	public static void main(String[] args) {
		Circle circle;
		circle = new Circle(); // uygulama calistiginda bellekte u satirda 24 byte lik yer isgal edilecek
		circle.x = 10.0;
		circle.y = 20.0;
		circle.r = 3.0;
		
		System.out.println(circle.x);
		System.out.println(circle.y);
		System.out.println(circle.r);
		
		double alan = circle.alanHesaplama();
		double cevre = circle.cevreHesapla();
		System.out.println(alan);
		System.out.println(cevre);
		
		Circle circle2 = new Circle();
		circle2.r = 30;
		System.out.println(circle2.alanHesaplama());
		System.out.println(circle2.cevreHesapla());
		
		Circle circle3 = circle2; // bu sekilde ikiside ayni obj yi gosterir
		circle3.r = 40;
		System.out.println(circle3.r);
		
		
	}

}
