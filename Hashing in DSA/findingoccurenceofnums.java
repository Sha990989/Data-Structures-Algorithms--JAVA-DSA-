/*finding  the occurrence of each digit by using hash 
  
    input:- 112256
 
    output:- 1=2,2=2,5=1,6=1

 */
import java.util.*;

public class findingoccurenceofnums {
    public static void main(String[] args) {
        int num=112256;

        Map<Integer,Integer> set=new HashMap<>();
        while(num!=0){
            int digit=num%10;
            set.put(digit,set.getOrDefault(digit,0)+1);
            num=num/10;
        }
        System.out.println(set);
}
}
