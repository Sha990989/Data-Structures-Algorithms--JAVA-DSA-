//write a program to perform linear search algorithm in given string find character "a" and replace with "*"
/*public class linear {
    public static void main(String args[])
    {
        String str="priya";
        char  target='a';
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
if ((ch)==target){
    System.out.println("*");
}
}
        }    
}
 */

public class linearsearchcharreplace {

    public static void main(String[] args) {
        String str = "Navaneetha";
        String result = linearSearch(str);
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + result);
    }

    public static String linearSearch(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                result += '*';  
            } else {
                result += str.charAt(i); 
            }
        }

        return result;
    }
}