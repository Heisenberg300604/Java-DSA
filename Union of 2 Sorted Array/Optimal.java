import java.util.ArrayList;

public class Optimal {

    public static void main(String[] args) {
        int arr1[] = { 1, 1, 2, 3, 4, 5 };
        int arr2[] = { 1, 2, 2, 5, 6 };
        int i = 0;
        int j = 0;
        int n = arr1.length;
        int m = arr2.length;
        // Declare the Union array
        ArrayList<Integer> Union = new ArrayList<>();
        // lets take a while loop
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);
                    
                }
                i++;
            } else {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j]) {
                    Union.add(arr2[j]);
                }
                j++;
            }
        }
        while (i < n) // IF any element left in arr1
        {
            if (Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) // If any elements left in arr2
        {
            if (Union.get(Union.size() - 1) != arr2[j]){
                Union.add(arr2[j]);
            }
                j++;
        }
        for (int val: Union)
    System.out.print(val+" ");
    }
}