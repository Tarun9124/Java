import java.util.Scanner;
class Account
{
    Scanner in = new Scanner(System.in);

    public static final int DEFAULT_ACNO = 123456;
	  static final double DEFAULT_BAL = 0.0;

    private  int ac_no;  
    private double bal;

    // public Account() { // 1st (default) Constructor
	// 	 this.ac_no = DEFAULT_ACNO;
	// 	 this.bal = DEFAULT_BAL;
	// }

   public Account(int ac_no,double bal)
   {
     this.ac_no = ac_no;
     this.bal = bal;
   }

   public Account(int ac_no)
   {
     this.ac_no = ac_no;
     this.bal = DEFAULT_BAL;
   }

   public int getAcNo()
   {
      return this.ac_no;
   }

    public double getBal()
   {
     return this.bal;
   }

   public void setBal(double bal)
   {
     this.bal = bal;
   }

   public void credit(double amount)
   {
     bal += amount;
     System.out.println("Your Balance After Credit = " + bal);
   }

   public void debit(double amount)
   {
    if(bal >= amount)
    {
     bal -= amount;
     System.out.println("Your Balance After Debit = " + bal);
    }
    else 
        System.out.println("You Have Not Suffcient Balance For Withdraw.");
   }

   public String toString() 
    {
		 return "Account[Account Number = " + ac_no + ", Balance = $" + bal + "]";
	}
}
class TestAcc
{
    public static void main(String args[])
    {
        Account a1 = new Account(12323,10000.0);
        System.out.println(a1);
        Account a2 = new Account(12324);
        System.out.println(a2);

        a1.setBal(20000.0);
        System.out.println(a1);

        System.out.println("After Credit : ");
        a1.credit(5000.0);

        System.out.println("After Debit : ");
        a2.debit(5000.0);

    }
}