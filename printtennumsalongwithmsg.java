//write a program to print 1 to 10 and also at last print "start!" message also using recursion

class printtennumsalongwithmsg {
    public static void main(String[] args) {
        System.out.println(numbers(10));
        System.out.println("start!");
    }
    public static int numbers(int num){
        if(num==0){
            //System.out.println("start!"); gives 10 9 8 7 6 5 4 3 2 1 start! 0
            return 0;
        }
        System.out.println(num);
         return numbers(num-1);
        
    }
}
   