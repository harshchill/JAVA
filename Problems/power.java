import java.util.Scanner;

public class power {
    public static int vector(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(vector(x, n));

    }
}
