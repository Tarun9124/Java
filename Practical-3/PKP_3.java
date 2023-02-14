class parent
{
   int a,b;

   void multi(int a,int b)
   {
    System.out.println("Parent Class.......");
    System.out.println("Multiplication = " + (a*b));
   }
}
class child1 extends parent
{
    void multi(int a,int b)
   {
    System.out.println("Child1 Class.......");
    System.out.println("Multiplication = " + (a*b));
   }
}
class child2 extends child1
{
    void multi(int a,int b)
   {
    System.out.println("Child2 Class.......");
    System.out.println("Multiplication = " + (a*b));
   }
}
class Test
{
    public static void main(String args[])
    {
        parent p = new parent();
        p.multi(2,3);

        p = new child1();
        p.multi(3,4);

        p = new child2();
        p.multi(5,2);

    }
}