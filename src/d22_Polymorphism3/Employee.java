package d22_Polymorphism3;

public class Employee {

	private String name;
	private String mission;
	private int salary;

	public Employee(String n, String m, int s) {
		name = n;
		mission = m;
		salary = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public String getMission() {
		return mission;
	}

	public void setMission(String m) {
		mission = m;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int s) {
		salary = s;
	}
	
	public void ozet() {
		System.out.println("Name: "+ name);
		System.out.println("Mission: "+ mission);
		System.out.println("Salary: "+salary);
	}

}
