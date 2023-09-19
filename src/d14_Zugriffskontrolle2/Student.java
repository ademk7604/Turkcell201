package d14_Zugriffskontrolle2;

public class Student {
	
	public String firstName;
	public String lastName;
	public int number;
	private int yas;
	
	public void setYas(int y) {
		if (y>0) {
			yas=y;
		}else {
			System.out.println("Yas degeri 0 dan kucuk olamaz");
		}
	}
	
	public void bilgileriYazdir() {
		System.out.println("Number: "+ number);
		System.out.println("FirsName: "+ firstName);
		System.out.println("LastName: "+ lastName);
		System.out.println("Yas: "+ yas);
	}
	

}
