public class BinaryTriangle {
    public static void main(String[] args) {

        int n = 5;
        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (num % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
                num++;
            }
            System.out.println();
        }
    }
}
