import java.util.Scanner;
class second_max
{
    public static void main(String args[])
    {
       int b=0,c=0,temp=0;
       Scanner in = new Scanner(System.in);
       System.out.println("Enter Five Numbers : ");
       for(int i=1;i<=5;i++)
       {
        System.out.print("Enter "+i+"th Number : ");
        int a = in.nextInt();
        if(a>b)
         {
            temp=a;
            a=b;
            b=temp;
            if(b>c)
            {
                temp=b;
                b=c;
                c=temp;
            }
         }
       }
       System.out.println("Second Max Value = " + b);
    }
}