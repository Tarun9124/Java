import java.util.Scanner;

class input{
    public static void main(String args[])
	{
	String str1;
	int num1;
	Scanner in = new Scanner(System.in);
	System.out.print("Type is an Integer : ");
	num1 = in.nextInt();
	System.out.print("Type is a line : ");
	in.nextLine();
	str1 = in.nextLine();
	System.out.println("num1 : " + num1 + "\t str1 : " + str1);
	}
}