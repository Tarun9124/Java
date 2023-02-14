abstract class circle{
    double r;
    abstract void area(double r);
}
class demoarea extends circle{
    void area(double r)
    {
        System.out.println("Area Of Circle = " + 3.14*r*r);
    }
}
class run{
    public static void main(String args[])
    {
        demoarea d1 = new demoarea();
        d1.area(4);
    }
}
