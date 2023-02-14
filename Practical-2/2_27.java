import java.util.*;
class prime
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
       int n,i,p,flag,cn;
      
       System.out.print("Enter Limit : ");
       n = in.nextInt();

       System.out.println("First "+n+" Prime Numbers are :-"); 
       p=2;
       i=1; 
       while(i<=n)
       {
         flag=1;
         for(cn=2;cn<=p-1;cn++)
         {
            if(p%cn==0)
            {
                flag=0;
                break;
            }
         }
            if(flag==1)
            {
                System.out.print(p + " ");
                i++;
            }
            p++;
       }
    }
}