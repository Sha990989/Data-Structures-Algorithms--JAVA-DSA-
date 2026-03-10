/*
->array={30,10,20,30,10,20,20,10}

output:-  10->3
          20->3
          30->2
        
 */

import java.util.HashMap;
import java.util.Map;

public class findingcountofsamenumsinarr {
    public static void main(String[] args) {
        int[] arr = {30, 10, 20, 30, 10, 20, 20, 10};

        // Create a HashMap to store the count of each number
        HashMap<Integer, Integer> counts = new HashMap<>();

        // Iterate through the array and count occurrences
        for (int num : arr) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        // Print the counts
        for(int key:counts.keySet()) {
            System.out.println(key + "->" + counts.get(key));
        }
    }

}
