import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {12,3,4,5,5,98,59,66,23};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0] = 88; // if you make a change to the object via this ref variable, same object will be changed
    }
}
