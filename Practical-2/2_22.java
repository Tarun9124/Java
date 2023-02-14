class Fibo{
   public static void main(String args[]) {
      int a, b, c;
      a = b = 1;
      System.out.println("Fibonacci series of First 20 number : " );
      System.out.print(a+" "+b);
      for(int i=2; i<20; i++) {
         c = a + b;
         System.out.print(" ");
         System.out.print(c);
         a = b; b = c;
      }
   }
}