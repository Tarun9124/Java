class parent
{
   int a=0;
   protected int b=1;
   public int c=2;
   private void print1()
   {
    System.out.println("Value = " + a + "\nValue = " + b + "\nValue = " + c);
   } 
   public void put()
   {
   System.out.println("Value = " + a + "\nValue = " + b + "\nValue = " + c);  
   }
}
class child extends parent
{
    
}
class Test
{
    public static void main(String args[])
    {
        child c1 = new child();
       // c1.print1(); // can't inherited because of private method
         c1.put();
    }
}