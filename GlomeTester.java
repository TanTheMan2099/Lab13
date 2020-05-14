import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This class test the Glome class.
 * 
 */
public class GlomeTester {

	// Testing parameterized constructor.
	@Test
	public void testGlome() {
		Glome glome = new Glome(5, "Glome");
		double delta = 0.0000001;
		assertEquals(5, glome.getRadius(), delta);
		assertEquals("Glome", glome.getName());
	}

	// Testing getter/accessor, getVolume().
	@Test
	public void testGetVolume() {
		Glome glome = new Glome(10, "Glome");
		double delta = 0.0000001;
		assertEquals(0.5 * Math.pow(Math.PI, 2) * Math.pow(10, 4), glome.getVolume(), delta);
	}

	// Testing toString() method.
	@Test
	public void testToString() {
		Glome glome = new Glome(20, "Glome");
		assertEquals("Glome [Radius: 20.0]", glome.toString());
	}
}
