//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] sampleArray = {23,44,62,78,112,421,2442,63,89,12,47};
        int targetelement = 23;
        if ( linearSearch(sampleArray,targetelement) == -1) {
            System.out.println("Target element does not exist in the Array !");
        }
        else{
            System.out.println("the element "+ targetelement+" was found at index "+linearSearch(sampleArray,targetelement));
        }

    }

    //let's search in the array...
    static int linearSearch(int [] arr, int target){
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (target == element ) {
                return i;
            }
        }
        return -1;
    }
}