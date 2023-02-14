class Box
{
   double width;
   double height;
   double depth;
   double weight;
   String bcol;
}
class boxweight extends Box {
    public void bweight()
    {
        System.out.println("Weight = " + weight);
    }
    
}
class boxcolor extends boxweight{
    public void bcolor()
    {
        System.out.println("Box Color = " + bcol);
    }
}
class TestBox
{
    public static void main(String  args[])
    {
        boxcolor b1 = new boxcolor();

        // b1.width = 10.2;
        // b1.height = 5.5;
        // b1.depth = 15.4;
        b1.weight = 5.9;
        b1.bcol = "Red";    
        b1.bweight();
        b1.bcolor();

    }
}
