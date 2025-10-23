import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the values of the array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int zeros = 0;
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeros = zeros +1;
                
            }else if (arr[i] > 0){
                positive = positive +1;
            }else if (arr[i] < 0){
                negative = negative + 1;
            }

        }
        System.out.println(" the zeros in the given array are : " + zeros);
        System.out.println(" the positive in the given array are : " + positive);
        System.out.println(" the negative in the given array are : " + negative);

        

    }
}
