class Box
{
   double width;
   double height;
   double depth;

   Box(double w,double h,double d)
   {
    width=w;
    height=h;
    depth=d;

    System.out.println("Width  = " + width + "\nHeight = " + height + "\nDepth  = " + depth + "\n");
   }
}
class Test
{
    public static void main(String args[])
    {
        Box b1 = new Box(9.0,7.0,5.0);
    }
}