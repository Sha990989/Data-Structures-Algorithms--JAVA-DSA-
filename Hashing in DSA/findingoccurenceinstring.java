/*finding the occurrence in string -> Mississippi

   input:- Mississippi
 
   output:- misp
 */
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class findingoccurenceinstring {
    public static void main(String[] args) {
        String str = "mississippi";
        HashSet<Character> map= new HashSet<>();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        for (char c : set) {       // or only   System.out.print(set);  gives output as [m, i, s, p]
            System.out.print(c);
        }
    
    }
}