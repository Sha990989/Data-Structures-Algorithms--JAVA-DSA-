//write a  program to print nth  Fibonacci series by using recursion
//0 1 1 2 3 5 8 13 21 34
class fibonacciusingrecursion {
    public static void main(String[]args){
        int n=10;
        for(int i=0;i<n;i++){
            System.out.println(fib(i)+" ");

        }
    }
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
}