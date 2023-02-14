class obj
{
    static int cn;
    obj()
    {      
        cn++;
    }
}
class Test
{
    public static void main(String args[])
    {
       obj o1 = new obj();
       obj o2 = new obj();

       System.out.println("Objects = " + obj.cn);
    }
}