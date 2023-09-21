package d20_Polymorphism;

public class Driver {
	
	public static void main(String[] args) {
		/*
		Animals animals1 = new Animals();
		animals1.sound();
		
		Cat cat1 = new Cat();
		cat1.sound();
		
		Dog dog1 = new Dog();
		dog1.sound();
		*/
		
		Animals animals2 = new Bird();
		animals2.sound();
		// base class olan Animal uzerinden Sub class olan  Bird referanslari tutulmus oldu. 
		// Bird classindaki sound methodu calisir. cok bicimlilik dedigimiz budur
	}

}
