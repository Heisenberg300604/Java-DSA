import java.util.*;

public class Brute {

    public static void main(String[] args) {
        int arr1[] ={1,1,2,3,4,5};
        int arr2[]={1,2,2,5,6};
        HashMap<Integer,Integer> freq = new HashMap<>(); // we take a hashmap and store all the unique value that we find 
        ArrayList<Integer> Union= new ArrayList<>(); // then we take an array Union where we store all the unique elements found in hashset
        for (int i = 0; i < arr1.length; i++) {
            freq.put(arr1[i], freq.getOrDefault(arr1[i],0)+1);
            System.out.print(freq);
        }
        for (int i = 0; i < arr2.length; i++) {
            freq.put(arr2[i], freq.getOrDefault(arr2[i],0)+1);
            // System.out.print(freq);
        }
        for (int it : freq.keySet()) { // .keySet() gives you a Set of all the unique keys in the map.
            Union.add(it);
        }
        for (int i : Union) {
            System.out.print(i);
        }
    }
}