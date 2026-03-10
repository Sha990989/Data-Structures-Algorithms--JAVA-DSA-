//write a program to print factorial of the given number by using tail recursion
//for tail recursion we need to give starting and ending points/condition

class printfactorialusingtailrecursion {
 public static void main(String[] args) {
    System.out.println(fact(5,1));
    
 }   
 public static int fact(int n,int num){
    if(n==1)
    {
        return num;
    }
    else{
        return fact(n-1,num*n);
    }

 }
}
