class Box
{
   double width;
   double height;
   double depth;

   Box()
   {
    width=10;
    height=5;
    depth=8;

    System.out.println("Width  = " + width + "\nHeight = " + height + "\nDepth  = " + depth + "\n");
   }
    Box(double h)
   {
     height=h;
     System.out.println("Height = " + height + "\n");
   }
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
        Box b1 = new Box();
        Box b2 = new Box(10.0);
        Box b3 = new Box(13.0,7.6,6.3);
    }
}