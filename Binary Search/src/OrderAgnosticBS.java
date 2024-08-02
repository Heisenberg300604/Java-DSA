public class OrderAgnosticBS {
    public static void main(String[] args) {
        int [] arr ={3,12,23,45,59,61,62,73,77,79,83,88,95,101};
        int [] array = {101,95,88,83,79,77,73,62,61,59,45,23,12,3};
        int target = 45;
        int ans = BinarySearch(array,target);
        System.out.println("The Element is located at index : "+ans);
    }

    static int BinarySearch ( int [] arr , int target){
        int start =0;
        int end = arr.length -1;
        boolean isAscending = arr[end] > arr[start]; // conditional statements return true or false for Array being sorted in ascending or descending order.
        if(isAscending){ // Condition when array is sorted in ascending order
            while(start <= end){
                int mid = start + (end - start)/2; // best possible way to find Mid
                if (target > arr[mid]){
                    start = mid+1;
                } else if (target < arr[mid]) {
                    end = mid-1;
                }else{
                    return mid;
                }
            }
        }else{ // if the Array is Sorted in Descending Order then..
            while(start <= end){
                int mid = start + (end - start)/2; // best possible way to find Mid
                if (target > arr[mid]){
                    end = mid-1;
                } else if (target < arr[mid]) {
                    start = mid+1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
}
