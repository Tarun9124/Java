import java.util.Scanner;

class Practical2_29 {
    public static void main(String[] args) {
        int N, temp, firstMax = 0, secondMax = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the value of N: ");
        N = scan.nextInt();
        System.out.println();
        for (int i = 1; i <= N; i++) {
            System.out.print("Input " + i + " number: ");
            temp = scan.nextInt();
            if (temp > firstMax) {
                secondMax = firstMax;
                firstMax = temp;
            } else if (temp > secondMax)
                secondMax = temp;
        }
        System.out.println("Second Maximum number is " + secondMax);
        scan.close();
    }
}
