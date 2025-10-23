import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n){
        if (n<=1) {
            return false;
        }
        for(int i =2; i< n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if (isPrime(num)) {
            System.out.println("the number is a prime");
        }else{
            System.out.println("the number is not a prime");
        }

    }
}
