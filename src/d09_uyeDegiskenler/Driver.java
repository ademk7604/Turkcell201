package d09_uyeDegiskenler;

public class Driver {
	
	public static void main(String[] args) {
		Bisiklet bisiklet = new Bisiklet();
		bisiklet.hiz = 10;
		bisiklet.vites = 18;
		Bisiklet.bisikletSayisi =1;
		bisiklet.bilgileriYazdir();
		System.out.println("-------");
		
		Bisiklet bisiklet2 = new Bisiklet();
		bisiklet2.hiz = 20;
		bisiklet2.vites = 12;
		Bisiklet.bisikletSayisi =2;
		bisiklet2.bilgileriYazdir();
		/*
		System.out.println(bisiklet.hiz);
		System.out.println(bisiklet.vites);
		*/
	}

}
