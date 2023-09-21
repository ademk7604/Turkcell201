package d22_Polymorphism3;

public class Officer extends Employee{
	
	private String unit; // birim onemli
	

	public Officer(String n, String m, int s, String u) {
		super(n, m, s);									// bu calssa ozel field lari parametre olarak ekneip class gelistirilebilir
		unit=u;
		// calisan sinifina extends ettigi icin ordaki parametreli methodu almak zorunda super ile 
	}
	
	public String getUnit() {
		return unit;
	}
	
	public void setUnit(String u) {
		unit=u;
	}
	
	public void ozet() {
		System.out.println("Officer name: "+getName());
		System.out.println("Officer mission: " + getMission());
		System.out.println("Officer salary: "+getSalary());
		System.out.println("Officer unit: "+getUnit());
	}

}
