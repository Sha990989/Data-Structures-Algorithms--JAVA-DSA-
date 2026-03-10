//write a program to print factorial of the given number by using linear recursion
import java.util.Scanner;
 class factorialusingrecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = factorial(n);
        System.out.println(f);
        sc.close();
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);  // decrease n
        }
    }
}
