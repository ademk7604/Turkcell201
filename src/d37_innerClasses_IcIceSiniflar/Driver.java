package d37_innerClasses_IcIceSiniflar;

public class Driver {
	public static void main(String[] args) {
		
		Auto auto =new Auto();
		auto.setMarka("X Marka");
		auto.setModel("Y Model");
		
		Auto.Motor motor = auto.new Motor();
		// auto.new Motor();= motor sinifi araba nesnesi uzerinden olusturuluyor
		motor.setHacim(1600);
		auto.setMotor(motor);
		
		System.out.println(auto.getMarka());
		System.out.println(auto.getModel());
		System.out.println(auto.getMotor().getHacim());
		
	}

}
