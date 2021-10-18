package pkgTestShape;
import pkgShape.Circle;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CircleTest {
	
	@Test
	public void test() {
		Circle C = new Circle();
		assertEquals(314.15, Math.floor(C.area(10)*100)/100);
		
		
	}

}
