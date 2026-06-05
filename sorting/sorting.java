
public class sorting {
    public static void output(int arr[]){
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
       
    }
    public static void main(String[] args) {
        int arr[] = {8,5,9,2,5,1,1};

        // bubble sort
        //outer loop runs n-1 time the number of elemets 
        for(int i = 0 ; i < arr.length-1 ; i++){
            //inner loop which compare the adjacent elements and swaps them if the conditions matches 
            for(int j =0 ; j<arr.length-i-1;j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
       output(arr);
    }
}
