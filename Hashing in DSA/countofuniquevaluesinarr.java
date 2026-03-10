/*array={1,2,2,3,3,4,5,5}  by using hashset

output:- 5 => {1,2,3,4,5}  
 */

import java.util.HashSet;
import java.util.Set;

public class countofuniquevaluesinarr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 5, 5};
        
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        System.out.println(set.size());
        }
 }

