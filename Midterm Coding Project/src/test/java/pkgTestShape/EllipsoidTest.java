package pkgTestShape;
import pkgShape.Ellipse;
import pkgShape.Ellipsoid;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EllipsoidTest {
	@Test
	public void test() {
		Ellipsoid E = new Ellipsoid();
		double volume = Math.round((E.volume(10,20,25)*100));
		double roundedVolume = volume/100;
		assertEquals(20943.95, roundedVolume);
	}
}
