package d18_inheritanceLab;

public class Driver {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.setName("Tugrul Caliskan");

		System.out.println(person1.getName());

		Student student1 = new Student();
		student1.setName("Ali Cakmakci");
		student1.setUnterricht("Mate");

		System.out.println(student1.getName());
		System.out.println(student1.getUnterricht());

		UniStudent uniStudent1 = new UniStudent();
		uniStudent1.setName("Mehmet Yildiz");
		uniStudent1.setUnterricht("Bilgisayar Temelleri 101");
		uniStudent1.setKampus("IngolstadtKampus");

		System.out.println(uniStudent1.getName());
		System.out.println(uniStudent1.getKampus());
		System.out.println(uniStudent1.getUnterricht());
		
		Lehrer lehrer1 = new Lehrer();
		lehrer1.setName("Ahmet Yilmaz");
		lehrer1.setSchule("x ilk ogretim okulu");
		System.out.println(lehrer1.getName());
		System.out.println(lehrer1.getSchule());
		
		Arzt arzt1 = new Arzt();
		arzt1.setName("Emrah Aydin");
		arzt1.setBrance("Dahiliye");
		System.out.println(arzt1.getName());
		System.out.println(arzt1.getBrance());
		

	}
}
