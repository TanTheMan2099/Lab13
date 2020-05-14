import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This class test the Sphere class.
 * 
 */
public class SphereTester {

	// Testing parameterized constructor.
	@Test
	public void testSphere() {
		Sphere sphere = new Sphere(5, "Sphere");
		double delta = 0.0000001;
		assertEquals(5, sphere.getRadius(), delta);
		assertEquals("Sphere", sphere.getName());
	}

	// Testing getter/accessor, getVolume().
	@Test
	public void testGetVolume() {
		Sphere sphere = new Sphere(10, "Sphere");
		double delta = 0.0000001;
		assertEquals(4 / 3.0 * Math.PI * 1000, sphere.getVolume(), delta);
	}

	// Testing toString() method.
	@Test
	public void testToString() {
		Sphere sphere = new Sphere(20, "Sphere");
		assertEquals("Sphere [Radius: 20.0]", sphere.toString());
	}
}
