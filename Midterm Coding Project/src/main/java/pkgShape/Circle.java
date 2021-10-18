package pkgShape;

public sealed class Circle extends Shape permits Ellipse {
	private int radius;
	public Circle () {
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	public double area(int radius) {
		if (radius < 0 ) 
			throw new IllegalArgumentException("radius is a negative value");
		double area = Math.PI * radius * radius;
		return area;
	}
	public int compareTo(Circle anotherCircle) {
		int n;
		int n2;
		if (anotherCircle.area(n2)>
		this.area(radius))
			n=1;
		else if (anotherCircle.area(n2) <
		this.area(radius))
			n=-1;
		else
			n=0;
		return n;
	}
}