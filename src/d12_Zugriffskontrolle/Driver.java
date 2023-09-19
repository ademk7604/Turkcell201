package d12_Zugriffskontrolle;

import d13_com.example.Auto;

public class Driver {
	
	public static void main(String[] args) {
		Student student = new Student();
		/*student.firstName = "Goktug";
		student.lastName = "Caliskan";
		student.number = 1;*/
		student.numarayiYazdir();
		
		Auto auto = new Auto(); // Auto class i baska bir projede olsaydi d13_com.example.Auto auto = new d13_com.example.Auto(); 
								//seklinde instance olusturabilirdik.
		// auto.marka = "Hundai"; farkli bir paketten default olan bir field i degistiremezsin boyle engeller java. 
								//sadece ayni pakettden default fieldlar degistirilebilir
								// public yapsak uygulamanin heryerinden ulasilabilir. publich yapmak risklidir her zaman deger atanabilir olur
		
		
	}

}
