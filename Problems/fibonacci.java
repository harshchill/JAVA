import java.util.Scanner;

public class fibonacci {
    public static void printFibonacci(int n) {
        if (n <= 0)
            return;
        System.out.println(0);
        if (n == 1)
            return;
        System.out.println(1);
        int a = 0 ;
        int b = 1;
        for (int i = 2; i < n; i++) {

            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int terms = sc.nextInt();
        sc.close();
        printFibonacci(terms);
    }
}
