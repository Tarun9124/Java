import java.util.Scanner;
class Fact{
	public static void main(String args[]){
	int fact=1,n;
	Scanner in = new Scanner(System.in);
		System.out.print("Enter Number : ");
		n = in.nextInt();
		for(int i=1;i<n+1;i++){
			fact=fact*i;
		}
	System.out.println("Factorial of " + n + " = "+fact);
	}
}