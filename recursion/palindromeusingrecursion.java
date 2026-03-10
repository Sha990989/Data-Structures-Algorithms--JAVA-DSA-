//write a program to check given string is palindrome or not using recursion


class palindromeusingrecursion {
    static boolean check(String s, int i) {
        if (i >= s.length() - 1 - i) return true;

        if (s.charAt(i) != s.charAt(s.length() - 1 - i))
            return false;

        return check(s, i + 1);
    }
    public static void main(String[] args) {
        String str = "madam";

        if (check(str, 0))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
