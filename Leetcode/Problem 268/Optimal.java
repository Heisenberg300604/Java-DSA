// Can be solved using the sumation approach 

public class Optimal {

    public static void main(String[] args) {
        int nums[] = {0,1,3};
        int n = nums.length;
        int sum = (n * (n+1)) /2;
        System.out.println(sum);
        int sum2=0;
        for(int i =0; i<n;i++){
            sum2= sum2+nums[i];
        }
        System.out.println(sum2);
        System.out.print(sum-sum2);
    }
}