class Box
{
   double width;
   double height;
   double depth;

   void SetDim(double w,double h,double d)
   {
    width = w;
    height = h;
    depth = d;
   }
}
class parameter
{
    public static void main(String  args[])
    {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.SetDim(10.0,23.2,12.11);
        mybox2.SetDim(12,13.6,9.12);

        System.out.println("For Box1---->  Width = " + mybox1.width + "  Height = " + mybox1.height + "  Depth = " + mybox1.depth);
        System.out.println("For Box2---->  Width = " + mybox2.width + "  Height = " + mybox2.height + "  Depth = " + mybox2.depth);
    }
}