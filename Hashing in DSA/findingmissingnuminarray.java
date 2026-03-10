/*write a program find the missing number in the given array

   input:- array={1,2,3,5,6,9}

   output:- (0,4,7,8)

 */
import java.util.HashSet;
import java.util.Set;

public class findingmissingnuminarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 9};
        
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        for(int i=0;i<9;i++)
        {
            if(!set.contains(i))
            {
                System.out.print(i+",");
            }
        }
    }
}