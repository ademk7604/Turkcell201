package d11_SiniflarLabxxDog;

public class Driver {
	
	public static void main(String[] args) {
		
		Dog kangal = new Dog();
		kangal.cins = "Sivas Kangal";
		kangal.boyut = Boyut.BUYUK;
		kangal.renk = Renk.SIYAH;
		kangal.yas=6;
		
		kangal.yemekYe();
		kangal.otur();
		kangal.kos();
		kangal.uyu();
	}

}
