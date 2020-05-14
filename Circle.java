/**
 * This class defines a circle object and stores its properties.
 * 
 */
public class Circle extends Shape implements Area {

	// Declaring variables or properties.
	private double radius;

	/**
	 * Parameterized Constructor.
	 * 
	 * @param radius The radius
	 * @param name   The name 
	 */
	public Circle(double radius, String name) {
		super(name);
		this.radius = radius;
	}

	/**
	 * This method returns the radius 
	 * 
	 * @return The radius 
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * This method sets the radius 
	 * 
	 * @param radius The radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	/*
	 * This is used to return the variable name
	 */ 
	public String getName() {
		return name;
	}

	@Override
	/*
	 * This is used to return the area
	 */ 
	public double getArea() {
		return Math.PI * radius * radius;
	}

	/**
	 * This method compares two Circle objects.
	 * 
	 * @param obj The object to be compared with.
	 * @return True if the two objects and their properties are equal and false
	 *         otherwise.
	 */
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle circle = (Circle) obj;
			return name.equals(circle.name) && Math.abs(radius - circle.radius) < 0.0000001;
		}
		return false;
	}

	/**
	 * This method returns a string representation of a Circle object.
	 * 
	 * @return A string representation of a Circle object.
	 */
	public String toString() {
		return name + " [Radius: " + radius + "]";
	}
}
