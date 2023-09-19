package d14_Zugriffskontrolle2;

public class Driver {
	public static void main(String[] args) {
		Student student = new Student();
		student.number=1;
		student.firstName = "Ali";
		student.lastName = "Batur";
		
		student.setYas(12);
		
		student.bilgileriYazdir();
	}
	
	

}
