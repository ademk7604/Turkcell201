package d42_ThrowLab;

public class Daire {
	double x, y, r;

	public Daire(double x, double y, double r) throws HataliYaricap {
		//throws ilgili sinifta intance alan sinif muhakkak bunu try-catch icine almalidir.
		if (r <= 0) {
			throw new HataliYaricap(r);
		} else {
			this.x = x;
			this.y = y;
			this.r = r;
		}
	}

}
