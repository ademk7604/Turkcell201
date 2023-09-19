package d11_SiniflarLabxxKalem;

public class Driver {
	
	public static void main(String[] args) {
		Kalem kursunKalem = new Kalem();
		kursunKalem.marka = "A Marka";
		kursunKalem.tip = "Kursun Kalem";
		kursunKalem.doldurulabilir = false;
		kursunKalem.silinebilir = true;
		
		kursunKalem.yaz("Merhaba Dunya");
		kursunKalem.tekrarDoldur();
		kursunKalem.sil();
		
		Kalem dolmaKalem = new Kalem();
		dolmaKalem.marka = "B Kalem";
		dolmaKalem.tip = "Dolma Kalem";
		dolmaKalem.doldurulabilir = true;
		dolmaKalem.silinebilir = false;
		
		dolmaKalem.yaz("Java ile OOP");
		dolmaKalem.tekrarDoldur();
		dolmaKalem.sil();
		
		
	}

}
