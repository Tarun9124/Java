class Demoobj
{
    int a,b;

    Demoobj(int i,int j)//constructor
    {
        a=i;
        b=j;
    }
   boolean equal(Demoobj d) //object as parameter
   {
      return(d.a == a && d.b == b);
   }
}

class test
{
    public static void main(String args[])
    {
        Demoobj o1 = new Demoobj(10,20);//assign values using constructor.
        Demoobj o2 = new Demoobj(20,10);//assign values using constructor.

        System.out.println("object 1 == Object 2 : " + o1.equal(o2));//pass argumnt as object
    }
}