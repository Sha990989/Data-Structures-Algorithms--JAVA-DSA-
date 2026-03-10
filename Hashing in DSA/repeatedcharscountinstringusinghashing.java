/*finding the repeated characters count in string -> Mississippi

   input:- Mississippi

   output:- m=1
            i=4
            s=4
            p=2
 */

import java.util.*;
public class repeatedcharscountinstringusinghashing {
    public static void main(String[] args) {
        String str = "mississippi";
            // <key      , value  >
        HashMap<Character, Integer> charCount = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {   //here we are getting the chaarcters
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        // Print the character counts
        // only this stmt System.out.println(charCount);
        //or
       for(char c:charCount.keySet()){
        System.out.println(c+"="+charCount.get(c));  
       } 
    }

}
