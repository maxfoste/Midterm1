package pkgTestShape;
import pkgShape.Ellipse;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EllipseTest {


	@Test
	public void test() {
		Ellipse E = new Ellipse();
		double area = Math.round((E.area(10,20)*100));
		double roundedArea = area/100;
		assertEquals(628.32, roundedArea);
		
	}

}