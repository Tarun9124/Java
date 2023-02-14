import java.util.Scanner;
class student
{
        long er;
        String name;
        static String clgname = "Dr. S. & S.S. GANDHY COLLEGE OF ENG. & TECH. SURAT";
        
        void get()
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Roll No.:- ");
            er = in.nextInt();

            System.out.print("Enter Name:- ");
            in.nextLine();
            name = in.nextLine();

            System.out.println("");

            // System.out.print("Enter College Name:- ");
            // clgname = in.nextLine();
        }
        void put()
        {
            System.out.println("Roll No.:- " + er);
            System.out.println("Name:- " + name);
            System.out.println("College Name:- " + clgname);
            System.out.println("");
        }
    
}
class test
{
    public static void main(String args[])
    {
         Scanner in = new Scanner(System.in);
        final int N;
        System.out.print("Enter Objects : ");
        N = in.nextInt();
        student s[] = new student[N];

        int n;

        System.out.print("Enter No of Students : ");
        n = in.nextInt();

       for(int i=0;i<n;i++)
       {
          s[i] = new student();
          s[i].get();
       }
        for(int i=0;i<n;i++)
       {
          s[i].put();
       }
    }
}