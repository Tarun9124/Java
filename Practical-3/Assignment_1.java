class area
{
    double area;
    area(double l,double b)
    {
        area = l*b;
        System.out.println("Area = " + area);
    }
    area(area a)
    {
       area = a.area;
       System.out.println("Area = " + area);
    }
}
class Rectangle
{
    public static void main(String args[])
    {
        area a1 = new area(5,4);
        area a2 = new area(a1);
    }
}