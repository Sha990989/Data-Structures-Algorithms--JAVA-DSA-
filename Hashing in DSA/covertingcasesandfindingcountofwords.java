/*input:- str= Java JAVA jAVA  Code code

    output:- java=3
             code=2
 */
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class covertingcasesandfindingcountofwords {
    public static void main(String[] args) {
        String str = "Java JAVA jAVA Code code";
        
        str=str.toLowerCase();
        String[] words = str.split(" ");
        HashMap<String, Integer> wordCount = new HashMap<>();
        for(String s:words){
            wordCount.put(s,wordCount.getOrDefault(wordCount,0)+1);
        }
         for(String s:wordCount.keySet()){
            System.out.println(s+"="+wordCount.get(s));

    }
}
}