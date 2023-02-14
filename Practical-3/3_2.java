class Box
{
   double width=10;
   double height=5;
   double depth=15;

   double Volume()
   {
    return width * height * depth;
   }
}
class volbox
{
    public static void main(String  args[])
    {
        Box mybox = new Box();
        double vol;

        vol = mybox.Volume();

        System.out.println("Volume of Box = " + vol);
    }
}