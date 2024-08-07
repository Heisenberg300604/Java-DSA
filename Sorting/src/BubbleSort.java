import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array = {5,4,3,2,1,966,7,6,745,6534,633,46,0};
        BubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void BubbleSort(int [] arr){
        // run the steps n-1 times
        boolean swapped;
        for(int i = 0;i < arr.length;i++){
            swapped = false; // to avoid repetition of the ith loop to run again and again
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length -i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    // we will swap them
                    int temp  = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break; // if the array is sorted then we will end the loop immediately after the check
            }
        }
    }
}
