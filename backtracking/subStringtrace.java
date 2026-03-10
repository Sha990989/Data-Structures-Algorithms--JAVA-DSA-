package backtracking;
/*==>give this content in string array:
A B C 
A C B 
B A C 
B C A 
C A B 
C B A
 */

public class subStringtrace {
    public static void subString(String str,String ans){
    if(str.length()==0){
    System.out.println(ans);
    return;
    }
    for(int i=0;i<str.length();i++)
    {
        char s =str.charAt(i);
        String result=str.substring(0,i)+str.substring(i+1); //substring function
        subString(result,ans+s); //function call
    }
    }
    public static void main(String[] args) {
        String str="ABC";
        subString(str,"");


    }
}
