package d32_IntefaceLab1;

public class AgirlikFiltresi implements ElmaFiltresi{
	@Override
	public boolean filtrele(Elma elma) {
		return elma.getAgirlik() >=80;
	}

}
