class callbyvalue
{
    public static void incre(int x,int y)//method
    {
        x++;
        y++;

        System.out.println("Value of A = " + x + " Value Of B = " + y);
    }
}
class test
{
    public static void main(String args[])
    {
       int a=10;
       int b=20;
       callbyvalue c = new callbyvalue();//object creation
       System.out.println("Value Before Function Call : ");
       System.out.println("Value of A = " + a + " Value Of B = " + b);

       System.out.println("Value After Function Call : ");
       c.incre(a,b);//call by value
    }
}