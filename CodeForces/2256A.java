import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int[] nums = new int[3];
            for (int i = 0; i < 3; i++) {
                nums[i] = sc.nextInt();
            }
            Arrays.sort(nums); // array is sorted
            // example - 2,3,10
            int range = nums[2] - nums[0];

            int newMax = nums[0] + nums[1];

            range = Math.min(range , newMax - nums[0]);
            System.out.println(range);
        }
    }
}
