/**
 * This class defines a cylinder object and stores its relevant properties.
 * 
 */
public class Cylinder extends Circle implements Volume {

	// Declaring variables or properties.
	private double height;

	/**
	 * Parameterized Constructor.
	 * 
	 * @param height The height 
	 * @param radius The radius 
	 * @param name   The name 
	 */
	public Cylinder(double height, double radius, String name) {
		super(radius, name);
		this.height = height;
	}

	/**
	 * This method returns the height of the cylindrical geometric shape.
	 * 
	 * @return The height 
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * This method sets the height of the cylindrical geometric shape.
	 * 
	 * @param height The height 
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getVolume() {
		return super.getArea() * height;
	}

	/**
	 * This method compares two Cylinder objects.
	 * 
	 * @param obj The object to be compared with.
	 * @return True if the two objects and their properties are equal and false
	 *         otherwise.
	 */
	public boolean equals(Object obj) {
		if (obj instanceof Cylinder) {
			Cylinder cylinder = (Cylinder) obj;
			return super.equals(cylinder) && Math.abs(height - cylinder.height) < 0.0000001;
		}
		return false;
	}

	/**
	 * This method returns a string representation of a Cylinder object.
	 * 
	 * @return A string representation of a Cylinder object.
	 */
	public String toString() {
		return name + " [Height: " + getHeight() + ", Radius: " + getRadius() + "]";
	}
}
