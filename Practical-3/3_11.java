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
   }

   Box(Box b)//copy constructor
   {
    width=b.width;
    height=b.height;
    depth=b.depth;

    System.out.println("Copy Constructor.....");
    System.out.println("Width  = " + width + "\nHeight = " + height + "\nDepth  = " + depth + "\n");
   }
}
class Test
{
    public static void main(String args[])
    {
        Box b1 = new Box(9.0,7.0,5.0);

        Box b2 = new Box(b1);//call copy constructor
    }
}