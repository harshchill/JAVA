import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println("The given number is even");
        }
        else{
            System.out.println("the given number is odd");
        }
        sc.close();
    }
}
