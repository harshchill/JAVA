public class hollowRectangle {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        // outer loop (for rows)
        for (int i = 1; i <= n; i++) {
            // inner loop (for coloms)
            for (int j = 1; j <= m; j++) {
                // cell on each rows
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
