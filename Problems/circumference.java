import java.util.Scanner;

public class circumference {
    public static double circum( int radii){
        return 2 * 3.14 * radii;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of the circle : ");
        int r = sc.nextInt();
        sc.close();
        System.out.println("the Circumferenece of the circle is  : " + circum(r));

    }
}
