import java.util.Scanner;
class matrix
{
    public static void main(String[] args) 
    {
        int p=3, q=3, m=3, n=3;
        Scanner s = new Scanner(System.in);
       
            int a[][] = new int[p][q];
            int b[][] = new int[m][n];
            int c[][] = new int[m][n];
            System.out.println("Enter all the elements of first matrix: "); //input 1st matrix
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    a[i][j] = s.nextInt();
                }
            }
			
            System.out.println("Enter all the elements of second matrix: "); //input 2nd matrix
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    b[i][j] = s.nextInt();
                }
            }
			
            System.out.println("First Matrix:"); //print 1st matrix
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println("");
            }
			
            System.out.println("Second Matrix:"); //print 2nd matrix
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println("");
            }
			
            for (int i = 0; i < m; i++)  //perform addition
            {
                for (int j = 0; j < n; j++) 
                {
                        c[i][j] = a[i][j] + b[i][j];
                }
            }
            System.out.println("Matrix after addition:"); //print addition
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    System.out.print(c[i][j]+"  ");
                }
                System.out.println("");
            }
        
    }
}