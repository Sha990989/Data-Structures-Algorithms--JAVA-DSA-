package backtracking;
//if we toss 3 coins then what is the probability?
public class backtracing { // it uses the concept of backtracking recursion
    public static void random(int n,String ans){
        if(n==0){
            System.out.println(ans+""); // if n=0 then it prints " "
            return;
        }
        random(n-1,ans+"1"); //concatinating just numbers
        random(n-1,ans+"0");
    }
    public static void main(String[] args) {
        random(3,"");   //Number of coin tosses
    }
}