package d32_IntefaceLab1;

public class RenkFiltresi implements ElmaFiltresi{

	@Override
	public boolean filtrele(Elma elma) {
		return elma.getRenk().equals("Kirmizi");
	}
}
