class ForEach{
   public static void main(String args[])
   {
    int nums[] = {10,20,30,40,50};
    int total = 0;
    for(int a : nums)
    {
        System.out.println("Value = " + a);
        total += a;
    }
    System.out.println("Total = " + total);
   }
}