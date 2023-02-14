class A
{
    int a;
    A(int a1)
    {
        a = a1;
    }
    private void display()
    {
        System.out.println("Value of a = " + a);
    }
    public void print()
    {
        System.out.println("Value of a = " + a);
    }
}

class B
{
   public static void main(String args[])
   {
    A obj1 = new A(9);
   // obj1.display(); // it gives error because display is private
    obj1.print(); //it runs because print is public method
   }
}