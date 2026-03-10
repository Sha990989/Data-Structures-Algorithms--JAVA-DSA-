//write a program to find the sum of "n" numbers using recursion
//1+2+3+4+5=15
/* 5+add(5-1)
   5+4+add(4-1)
    5+4+3+add(3-1)
    5+4+3+2+add(2-1)
    5+4+3+2+1+add(1-1)
    5+4+3+2+1+0
    =15
    */
class findnnumsusingrecursion{
    public static void main(String[] args) {
        System.out.println(add(5));
    }
    public static int add(int num){
        if(num==0){
            return 0;
        }
        else{
            return num+add(num-1);//here add(num-1)fucntion is calling recursively
        }
    }
}