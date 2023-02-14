class A
{
   static int x = 10;
   int y = 20;

   private static int z = 30;

   static class B
   {
      void get()
      {
        System.out.println("X = " + x);
        System.out.println("Z = " + z);
      }
   }
}

class Test
{
    public static void main(String args[])
    {
        A.B obj1 = new A.B();
        obj1.get();
    }
}