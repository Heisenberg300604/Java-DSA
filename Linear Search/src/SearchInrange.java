public class SearchInrange {
    public static void main(String[] args) {
        int [] arr = {12,1,2,3,4,5,56,46,7,325,452,1,5,35,23};
        int start = 1;
        int end =7;
        int target = 3;

        System.out.println(linearSearch(arr,target,start,end));
    }

    static int linearSearch(int [] arr, int target,int start,int end){
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (target == element ) {
                return i;
            }
        }
        return -1;
    }
}
