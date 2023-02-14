class Box
{
   double width;
   double height;
   double depth;
}
class TestBox
{
    public static void main(String  args[])
    {
        Box mybox = new Box();

        mybox.width = 10;
        mybox.height = 5;
        mybox.depth = 15;

        System.out.println("Height = " + mybox.height + "  Width = " + mybox.width + "  Depth = " + mybox.depth);
    }
}