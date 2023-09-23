package d31_Interface2;

public class Karga implements Ucabilir,Yuruyebilir{

	@Override
	public void uc() {
		System.out.println("Kargalar ucabilir");
	}
	@Override
	public void yuru() {
		System.out.println("Karga yuruyebilir");
	}
}
