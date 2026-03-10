//write a program for linear recursion for finding product of n numbers
//it can also like factorial of n numbers
class printnnumsproduct {
    public static void main(String[] args) {
        System.out.println(product(5));
    }
    public static int product(int num){
        if(num==0){
            return 1;
        }
        else{
            return num*product(num-1);
        }
    }
}
