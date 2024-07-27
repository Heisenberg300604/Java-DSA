public class MinNumberInArray {
    public static void main(String[] args) {
        int [] arr = {99,59,56,69,34,25,532,1987,11,3};
        System.out.println(min(arr));
    }
    static int min(int [] arr){
        int minno = arr[0] ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minno) {
                minno = arr[i];
            }
        }
        return minno;
    }

}
