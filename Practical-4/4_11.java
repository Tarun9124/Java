interface police {
    void call(int p);
 }
 class man implements police{
     public void call(int n)
     {
         System.out.println("In Danger Call with Dial " + n);
     }
 }
 class anotherman implements police{
    public void call(int n)
    {
        System.out.println("Call Ambulance with Dial " + (n+8));
    }
}
 class testinterface{
     public static void main(String args[])
     {
         man m1 = new man();
         m1.call(100);
         anotherman a1 = new anotherman();
         a1.call(100);
     }
 }
 