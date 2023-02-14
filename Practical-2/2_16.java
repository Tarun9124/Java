import java.util.Scanner;

class scan{
    public static void main(String args[])
	{
	String s = "Passing argument using scanner class as object";
	Scanner scan = new Scanner(s);
	
	System.out.println("string : " + scan.nextLine());
	}
}