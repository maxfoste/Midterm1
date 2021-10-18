package pkgShape;

public final class Ellipsoid extends Ellipse{
	private int radius1;
	private int radius2;
	private int radius3;
	
	
	public Ellipsoid() {

	}
	
	public Ellipsoid(int radius1, int radius2, int radius3) {
		super (radius1, radius2);
		this.radius1 = radius1;
		this.radius2 = radius2;
		this.radius3 = radius3;
	}
	
	public double volume(int radius1, int radius2, int radius3) {
		double volume = Math.PI * radius1 * radius2 * radius3 *  4 / 3 ;
		return volume;
	}
	public int compareTo(Ellipsoid anotherEllipsoid) {
		int n;
		int n4, n5, n6;
		if (anotherEllipsoid.volume(n4, n5, n6) >
		this.volume(radius1, radius2, radius3))
			n=1;
		else if (anotherEllipsoid.volume(n4, n5, n6) <
		this.volume(radius1, radius2, radius3))
			n=-1;
		else
			n=0;
		return n;
	}
}