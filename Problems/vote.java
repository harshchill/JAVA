import java.util.Scanner;

public class vote {
    public static boolean check( int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();
        if(check(age)){
            System.out.println("user can vote");

        }else{
            System.out.println("user is chota bacha abhi");
        }

    }
}
