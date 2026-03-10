/*   finding common values:-

    arr1={4,3,2,1,5}
    arr2={6,7,9,3,5}

   output:- (3,5)

 */
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
public class commonvaluesintwoarrays {
    public static void main(String[] args) {
        int[] arr1 = {4,3,2,1,5};
        int[] arr2 = {6,7,9,3,5};
        int target = 8;
        HashSet<Integer> h=new HashSet<>();
        HashSet<Integer> common = new HashSet<>();
         for (int x : arr1) {
            h.add(x);
        }

        for (int y : arr2) {
            if (h.contains(y)) {
                common.add(y);
            }
        }

        System.out.println("Common values: " + common);
}
}
