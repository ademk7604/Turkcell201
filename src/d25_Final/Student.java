package d25_Final;

public /*final*/ class Student {

	private final int number;
	
	public Student(int n) {	// bu sekilde final atanan field e ilk degeri verebiliyoruz. hehangi bir erede bu degistiirilemeyecektir
		number=n;
	}

	public int getNumber() {
		return number;
	}
	/*
	 * bu durumda final olarak atadigimiz iiicn bu field set metod ile
	 * degistiremeyiz eger uygulama ilk calistiginda number degeri atanip sonra
	 * degistirilmesini istemiyorsak constructor araciligiyla ilk degeri alabiliriz
	 * public void setNumber(String _number) { number=_number; }
	 */
	
	public /*final*/ void yazdir() { // burda da ayni durum var
		System.out.println(number);
	}

}
