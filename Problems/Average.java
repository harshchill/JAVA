import java.util.Scanner;

public class Average {
    public static int avg(int i , int j , int k){
        return (i + j + k) / 3;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();

        int average = avg(num1, num2, num3);
        System.out.println("the average of those 3 numbers are : " + average);
    }
}
