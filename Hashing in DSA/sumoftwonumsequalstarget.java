/*==>sum of any two data should be equal to target else return a message

clue:-
-->  create array ,find sum of the numbers =target

-->target =10

   {9,1,6,7,3,4,5,3} ==>(6,4) (7,3) (9,1) .............
 */



import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

public class sumoftwonumsequalstarget {
    public static void main(String[] args) {

        int[] arr = {2,7,11,15,6,3,1,8};
        int target = 9;

        HashMap<Integer,Integer> h = new HashMap<>();
        HashSet<String> printed = new HashSet<>();  // to avoid duplicate pairs

        for (int i = 0; i < arr.length; i++) {

            int temp = target - arr[i];

            if (h.containsKey(temp)) {

                // avoid duplicate pairs (ex: 7+2 and 2+7)
                int a = arr[i];
                int b = temp;
                String pair = Math.min(a,b) + "," + Math.max(a,b);

                if (!printed.contains(pair)) {
                    System.out.println(a + " + " + b + " = " + target);
                    printed.add(pair);
                }
            }

            h.put(arr[i], i);
        }

        if (printed.isEmpty()) {
            System.out.println("No pair found");
        }
    }
}
