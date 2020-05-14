/**
 * This class defines a Glome object and stores its properties.
 * 
 */
public class Glome extends Sphere implements Volume {

	/**
	 * Parameterized Constructor.
	 * 
	 * @param radius The radius 
	 * @param name   The name 
	 */
	public Glome(double radius, String name) {
		super(radius, name);
	}

	@Override
	public double getVolume() {
		return 0.5 * Math.PI * Math.PI * Math.pow(getRadius(), 4);
	}

	/**
	 * This method returns a string representation of a Glome object.
	 * 
	 * @return A string representation of a Glome object.
	 */
	public String toString() {
		return super.toString();
	}
}
