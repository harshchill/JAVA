
public class selection {
    public static void output(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 8, 5, 9, 2, 5, 1, 1 };


        // seletion sort
        ///outer loop to iterate through the array n-1 times
        for (int i = 0; i < arr.length - 1; i++) {
            //smallest index to store the index of smallest element
            int smallestIndex = i;
            //inner loop to compare the smallest element with the rest of the elements , starts from i +1 
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallestIndex] > arr[j]) {
                    //declare the new smallest index if it finds a smaller element
                    smallestIndex = j;
                }
            }
            //swap the smallest element with the current element at index i
            int temp = arr[smallestIndex];
            arr[smallestIndex]=arr[i];
            arr[i]=temp;
        }
        output(arr);
    }
}
