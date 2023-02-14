import java.util.*;
class max
{
  public static void main(String args[])
  {
    int n1,n2,n3;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Three Numbers : ");
    n1 = in.nextInt();
    n2 = in.nextInt();
    n3 = in.nextInt();

    if(n1 >= n2 && n1 >= n3)
      System.out.println(n1+" is Maximum Number.");
    else if(n2 >= n1 && n2 >= n3)
      System.out.println(n2+" is Maximum Number.");
    else System.out.println(n3+" is Maximum Number.");
  }
}