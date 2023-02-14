interface police {
   void call(int p);
}
class man implements police{
    public void call(int n)
    {
        System.out.println("In Danger Call with Dial " + n);
    }
}
class testinterface{
    public static void main(String args[])
    {
        man m1 = new man();
        m1.call(100);
    }
}
