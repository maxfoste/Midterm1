package pkgShape;

public sealed class Ellipse extends Circle permits Ellipsoid{
	private int radius1;
	private int radius2;

	public Ellipse(int radius1, int radius2) {
		super(radius1);
		this.radius1 = radius1;
		this.radius2 = radius2;
	}
	public Ellipse() {
	}
	public double area (int radius1,int radius2) {
		double area = Math.PI * radius1 * radius2;
		return area;
	}
	public int compareTo(Ellipse anotherEllipse) {
		int n;
		int n3, n4;
		if (anotherEllipse.area(n3, n4) >
		this.area(radius1, radius2))
			n=1;
		else if (anotherEllipse.area(n3,n4) <
		this.area(radius1, radius2))
			n=-1;
		else
			n=0;
		return n;
	}
}
