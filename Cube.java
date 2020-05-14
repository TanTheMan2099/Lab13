/**
 * This class defines a cube object and stores its properties.
 * 
 */
public class Cube extends Square implements Volume {

	/**
	 * Parameterized Constructor.
	 * 
	 * @param side The side length of the cubic shape.
	 * @param name The name of the cubic shape.
	 */
	public Cube(double side, String name) {
		super(side, name);
	}

	@Override
	public double getVolume() {
		return getSide() * getSide() * getSide();
	}

	/**
	 * This method returns a string representation of a Cube object.
	 * 
	 * @return A string representation of a Cube object.
	 */
	public String toString() {
		return super.toString();
	}
}
