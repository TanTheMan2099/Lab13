/**
 * This abstract class defines a general shape.
 * 
 */
public abstract class Shape {

	// Declaring variables or properties.
	protected String name;

	/**
	 * Parameterized Constructor.
	 * 
	 * @param name The name of the geometric shape.
	 */
	public Shape(String name) {
		this.name = name;
	}

	/**
	 * This method returns the name of the geometric shape.
	 * 
	 * @return The name of the geometric shape.
	 */
	public abstract String getName();
}