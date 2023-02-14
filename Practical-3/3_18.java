class fun {
 static int number; // a static variable
 static {
    // a static initializer block run only once
    // when the class is loaded
      number=88;
      System.out.println("loading class...");
 }
} 

class Test
{
    public static void main(String args[])
    {
 
    }
}
