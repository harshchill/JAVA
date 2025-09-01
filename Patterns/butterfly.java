public class butterfly {
    public static void main(String[] args) {
        int n = 5;

        //upper halve
        for(int i = 1; i<= n; i ++){
            //upper left
            for (int j =1 ; j <= i; j++){
                System.out.print("*");
            }
            //spaces
            int spaces = 2*(n-i); 
            for(int j =1 ;j <= spaces; j ++){
                System.out.print(" ");
            }
            //upper right
            for (int j =1 ; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower halve
        for(int i = n; i>= 1; i --){
            //upper left
            for (int j =1 ; j <= i; j++){
                System.out.print("*");
            }
            //spaces
            int spaces = 2*(n-i); 
            for(int j =1 ;j <= spaces; j ++){
                System.out.print(" ");
            }
            //upper right
            for (int j =1 ; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }
}
