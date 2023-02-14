import java.util.*;
import java.io.*;
class separate{
	public static void main(String args[]){
		int num;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number : ");
		num = in.nextInt();
		System.out.println("Original Number : " + num );
		System.out.print("Seperated Number : "  );
		String result = Integer.toString(num);
		for(int i = 0;i<result.length();i++)
        {
			System.out.print(result.charAt(i)+" ");
		}
	}
}