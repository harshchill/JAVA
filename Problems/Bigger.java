import java.util.Scanner;

public class Bigger {
    public static int greater ( int x , int y){
        if (x>y) {
            return x;
        }
        else{
            return y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = greater(num1, num2);
        System.out.println("Bigger number is : "+result);
    }
}
