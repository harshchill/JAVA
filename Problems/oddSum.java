import java.util.Scanner;

public class oddSum {
    public static void oddSumPrint(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i = i + 2) {
            sum = sum + i;
        }
        System.out.println("Sum is all odd numbers between is : " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        oddSumPrint(num);
    }
}
