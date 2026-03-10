package backtracking;

public class findsubstrings {
    public static void subArrays(String str,int index,String curr) {
        if (index == str.length()) {
                System.out.println(curr);
            return;
        }
    subArrays(str, index+1, curr+str.charAt(index));
    subArrays(str, index+1,curr);
}
public static void main(String[] args) {
    String str="abc";
    subArrays(str,0 ,"");
}
}
