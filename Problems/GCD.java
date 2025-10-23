public class GCD {

    public static int getGCD(int a , int b){
        while (b!=0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int a = 54;
        int b = 24;
        System.out.println(" the GCD of "+ a +" and "+ b +" is: " + getGCD(a,b));
    }
}
