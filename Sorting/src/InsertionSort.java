import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] array = {5,4,3,2,1};
        Insertion(array);
        System.out.println(Arrays.toString(array));
    }
    static void Insertion(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j] <arr[j-1] ) {
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }

    static void swap(int []arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] =  temp;
    }
}
