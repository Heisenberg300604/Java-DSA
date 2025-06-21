import java.util.*;

// Given an array of integers, print how many times each number appears.
//Example Input = [1, 2, 1, 3, 2, 4, 1]
class Solution{
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 2, 4, 1};
        // Declaring a HashMap
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : array){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }

        // Print the frequencies
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}