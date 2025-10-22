public class counter {
    public static void main(String[] args) {
        int count = 0;
        do {
            count = count +1;
            System.out.println("count is : "+ count);
            if(count >= 100){
                break;
            }
        } while (true);
    }
}
