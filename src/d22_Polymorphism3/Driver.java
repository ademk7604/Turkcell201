package d22_Polymorphism3;

public class Driver {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Ali Can", "IT muduru", 2650);
		//employee1.ozet();
		
		Officer officer1 = new Officer("Jonas Ekrem", "Developer", 2000, "portfolio");
		//officer1.setUnit("Portfolio"); Officer in pararmetresine String u ekleyip icin de unit=u dedigimizde buna gerek kalmiyor
		officer1.ozet();
	}

}
