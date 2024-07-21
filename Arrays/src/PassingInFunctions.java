import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums ={3,25,221,14};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[1] = 53;
    }
}
