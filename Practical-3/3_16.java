class Circle {
	public static int numCircles = 0; //static variable
	private double x,y,r; 

	Circle (double x, double y, double r){
		this.x = x;
		this.y = y;
		this.r = r;
		numCircles++;
	}			
}
class Test
{
    public static void main(String args[])
    {
        Circle c1 = new Circle(10.0,7.0,6.0);
        Circle c2 = new Circle(15.0,9.0,7.0);
        //use of static variable
        System.out.println("Number of Circles = " + Circle.numCircles); //static member call using classname.staticvariablename
    }
}