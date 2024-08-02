public class BinarySearch {
    public static void main(String[] args) {
        int [] arr ={3,12,23,45,59,61,62,73,77,79,83,88,95,101};
        int target = 45;
        int ans = BinarySearch(arr,target);
        System.out.println("The Element is located at index : "+ans); // we will print the index at which the element is there in the array !
    }

    static int BinarySearch(int [] arr , int target){
        int start =0;
        int end = arr.length -1;
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
        return -1;
    }

}
