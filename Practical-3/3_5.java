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
}
class Test
{
    public static void main(String args[])
    {
        Box b1 = new Box();
    }
}