package d11_SiniflarLabxxAuto;

public class AutoDriver {
	public static void main(String[] args) {
		
		Auto taksi = new Auto();
		taksi.marka = "Skoda";
		taksi.model = "Oktovia";
		taksi.renk = Renk.LACIVER;
		taksi.vites = Vites.HYBRID;
		
		taksi.hareketEtsin("mars cevrildi");
		taksi.yurusun();
		taksi.yakitDoldur();
				
		
	}

}
