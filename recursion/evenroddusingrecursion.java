//write a program to check the given number is even or odd using recursion
//9 8 7 6 5 4 3 2 1 0=>t/f=>even/odd
class evenroddusingrecursion{
    public static void main(String[] args) {
        System.out.println(isEven(9));
        System.out.println(isOdd(9));
    }
    public static boolean isEven(int n){   //base code
        if(n==0){
            return true;
        }
        return isOdd(n-1);//recursive calling each other
    }
    public static boolean isOdd(int n){ //base code
        if(n==0){
            return false;
        }
        return isEven(n-1);//recursive calling each other

    }
}