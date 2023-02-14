class CallByRef
 {
    int a, b;
    CallByRef(int i, int j) 
    {
    a = i;
    b = j;
    }
    // pass an object
    void meth(CallByRef o) 
    {
    o.a += 10;
    o.b -= 10;
    }
 }
class Test 
{
   public static void main(String args[])
   {
   CallByRef ob = new CallByRef(15, 20);
   System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
   ob.meth(ob);
   System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
   }
}