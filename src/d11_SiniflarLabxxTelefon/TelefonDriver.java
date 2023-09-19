package d11_SiniflarLabxxTelefon;

public class TelefonDriver {
	public static void main(String[] args) {
		Telefon telefon  = new Telefon();
		telefon.marka = "X Marka";
		telefon.model = "Y Model";
		telefon.tip = TelefonTipi.CEP;
		telefon.mobilVeri = true;
		telefon.wifi = true;
		
		telefon.aramaYap("5554433"); // burayi yoruma aldigimizda bu methoddaki aramaVarmi methodu true olmuoyr alttaki methodda calismaz.
									// bu abstraction diyoruz. yani arka planda methodundetayini bilmeden kullanmak
		telefon.aramayiSonlandir();
		telefon.mesajGonderme("merhaba, nasilsin");
	}

}
