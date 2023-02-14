import java.util.Scanner;
class Reverse{
	 public static void main(String args[]) {
		int a;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number to Reverse : ");
		a = in.nextInt();
		System.out.print("Reverse of "+a+" = ");
		while(a>0){
			int num = a%10;	
			a=a/10;
			System.out.print(num+" ");
		}

	}
}