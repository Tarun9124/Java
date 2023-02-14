import java.util.Scanner;
class circle
{
   int r;
   void get()
   {
     Scanner in = new Scanner(System.in);
     System.out.print("Enter Radius : ");
      r = in.nextInt();

     System.out.println("Radius = " + r);
   }
   double area()
   {
     return 3.14 * r * r;
   }
}
class User
{
   public static void main(String args[])
   {
     circle c1 = new circle();
     double a;

     c1.get();
     a = c1.area();

     System.out.println("Area = " + a);

   }
}