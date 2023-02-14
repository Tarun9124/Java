class Circle { 
// The public constants
	public static final double DEFAULT_RADIUS = 8.8;
	public static final String DEFAULT_COLOR = "red";
 // The private instance variables
	private double radius;
	private String color;
 // The (overloaded) constructors
	public Circle() { // 1st (default) Constructor
		 this.radius = DEFAULT_RADIUS;
		 this.color = DEFAULT_COLOR;
	}

	public Circle(double radius) { // 2nd Constructor
		 this.radius = radius;
		 this.color = DEFAULT_COLOR;
	}

	public Circle(double radius, String color) { // 3rd Constructor
		 this.radius = radius;
		 this.color = color;
	}
    public double getRadius() {
		 return this.radius;
	}

	public void setRadius(double radius) {
		 this.radius = radius;
	} 

	public String getColor() {
		 return this.color;
	}

	public void setColor(String color) {
		 this.color = color;
	}

 // The toString() returns a String description of this instance

	public String toString() {
		 return "Circle[radius = " + radius + ", color = " + color + "]";
	}
 // Return the area of this Circle

	public double getArea() {
		 return Math.PI * radius * radius ;
	}
 // Return the circumference of this Circle

	 public double getCircumference() {
		 return 2.0 * Math.PI * radius ;
	 }
 } 

 class TestCircle {
	public static void main(String[] args) {

	Circle c1 = new Circle(1.1, "blue");
	System.out.println(c1); // toString()
	Circle c2 = new Circle(2.2);
	System.out.println(c2);
	Circle c3 = new Circle();
	System.out.println(c3); 

	c1.setRadius(2.2);
	c1.setColor("green");
	System.out.println(c1); 
	System.out.printf("The area is: %.2f%n", c1.getArea());
	System.out.printf("The circumference is: %.2f%n",c1.getCircumference());
	}
} 