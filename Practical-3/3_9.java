class Maxi
{
    void max(int a,int b)
    {
        if(a>b)
            System.out.println(a + " is Maximum Number");
        else System.out.println(b + " is Maximum Number");
    }
    void max(String a,String b)
    {
        int a1,b1;
        a1 = a.length();
        b1 = b.length();
        if(a1>b1)
             System.out.println(a + " is Large String.");
        else System.out.println(b + " is Large String.");
    }
}
class Try
{
    public static void main(String args[])
    {
    Maxi m1 = new Maxi();
    m1.max(3,4);
    m1.max("tar","taat");
    }
}