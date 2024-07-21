public class Max {
    public static void main(String[] args) {
        int[] arr = {2,5,6,71,88,21,58};
        System.out.println("the maximum value in the array is : ");
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
