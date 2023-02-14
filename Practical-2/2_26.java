import java.util.Scanner;
class Recursion_Fact{
    static int fact(int n)
    {
        if(n==0 || n==1)
           return 1;
        else return n * fact(n-1);
    }
    public static void main(String args[])
    {
      int ans;
      Scanner in = new Scanner(System.in);
		System.out.print("Enter Number : ");
		ans = in.nextInt();
        ans = fact(ans);
        System.out.print("Factorial = "+ans);
    } 
}
