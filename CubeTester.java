import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This class test the Cube class.
 * 
 */
public class CubeTester {

	// Testing parameterized constructor.
	@Test
	public void testCube() {
		Cube cube = new Cube(5, "Cube");
		double delta = 0.0000001;
		assertEquals(5, cube.getSide(), delta);
		assertEquals("Cube", cube.getName());
	}

	// Testing getter/accessor, getVolume().
	@Test
	public void testGetVolume() {
		Cube cube = new Cube(10, "Cube");
		double delta = 0.0000001;
		assertEquals(1000, cube.getVolume(), delta);
	}

	// Testing toString() method.
	@Test
	public void testToString() {
		Cube cube = new Cube(5, "Cube");
		assertEquals("Cube [Side: 5.0]", cube.toString());
	}
}
