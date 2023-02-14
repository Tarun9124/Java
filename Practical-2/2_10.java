class array{
  public static void main(String args[])
  {
   int i;
   double b[] = {1,2,3,4,5},total=0; 
   for(i=0;i<5;i++)
   {
    total = total + b[i];
	//average = total/i;
   }
   System.out.println("Average = " + total/5);
  }
}