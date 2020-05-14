/**
 * This class defines a square object and stores its properties.
 * 
 */
public class Square extends Shape implements Area {

	// Declaring variables or properties.
	private double side;
	
	/**
	 * Parameterized Constructor.
	 * 
	 * @param side The side length
	 * @param name   The name 
	 */
	public Square(double side, String name) {
		super(name);
		this.side = side;
	}
	
	/**
	 * This method returns the side length 
	 * 
	 * @return The side length 
	 */
	public double getSide() {
		return side;
	}

	/**
	 * This method sets the side length 
	 * @param side The side length 
	 */
	public void setSide(double side) {
		this.side = side;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getArea() {
		return side * side;
	}
	
	/**
	 * This method compares two Square objects.
	 * 
	 * @param obj The object to be compared with.
	 * @return True if the two objects and their properties are equal and false
	 *         otherwise.
	 */
	public boolean equals(Object obj ) {
		if (obj instanceof Square) {
			Square square = (Square) obj;
			return name.equals(square.name) && Math.abs(side - square.side) < 0.0000001;
		}
		return false;
	}
	
	/**
	 * This method returns a string representation of a Square object.
	 * 
	 * @return A string representation of a Square object.
	 */
	public String toString() {
		return name + " [Side: "  + side + "]";
	}

}
