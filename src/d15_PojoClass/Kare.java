package d15_PojoClass;

public class Kare {

	private int x;
	private int y;
	private int uzunluk;

	public int getX() {
		return x;
	}

	public void setX(int _x) {
		if(_x>=0) {
			x = _x;
		} else {
			System.out.println("_x -1`den buyuk olmalidir");
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int _y) {
		if (_y>=0) {
			y = _y;					// y i -5 olarak girdigim de default olan 0 degerini aliyor cunku if saglanmamis olur
		} else {
			System.out.println("_y -1`den buyuk olmalidir");
		}
	}

	public int getUzunluk() {
		return uzunluk;
	}

	public void setUzunluk(int _uzunluk) {
		if (uzunluk>=0) {
			uzunluk = _uzunluk; 			// uzunluk = uzunluk dedigin zaman default olan 0 i sonuc olarak veriyor
		} else {
			System.out.println("_uzunluk -1`den buyuk olmalidir");
		}
	}
	
	public void ekranaBastir() {
		System.out.println("X: "+x);
		System.out.println("Y: "+y);
		System.out.println("Uzunluk: "+uzunluk);
		
	}

}
