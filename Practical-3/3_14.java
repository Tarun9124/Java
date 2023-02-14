class RetOb
{
int a;
RetOb(int i) 
   {
	a = i;
   }
RetOb incrBytwo() 
   {
      RetOb temp = new RetOb(a+2);
      return temp;
   }
}

class Test
{
   public static void main(String args[]) 
   {
   RetOb t1 = new RetOb(2);
   RetOb t2;
   t2 = t1.incrBytwo();
   System.out.println("t1.a: " + t1.a);
   System.out.println("t2.a: " + t2.a);
   t2 = t2.incrBytwo();
   System.out.println("t2.a after second increase: " + t2.a);
   }
}