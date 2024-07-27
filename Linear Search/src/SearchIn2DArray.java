import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
                {23,44,53,1},
                {18,12,9,3},
                {78,99,34,56},
                {69,84}
        };
        int target = 9;
        int [] ans = search(arr,target); // format of return value -{row,column}
        System.out.println(Arrays.toString(ans));
    }

    static int[] search (int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]  {i,j}; // you have to declare the array here in this syntax
                }
            }
        }
        return new int [] {-1,-1};
    }
}
