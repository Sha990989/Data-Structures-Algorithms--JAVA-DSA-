package backtracking;
public class probablilityofcoins {
    public static void main(String[] args) {
        int n = 3; // Number of coin tosses
        System.out.println("All possible outcomes for " + n + " coin tosses:");
        generateOutcomes("", n);
        System.out.println("Total number of possible outcomes: " + (int) Math.pow(2, n));
    }

    public static void generateOutcomes(String current, int remaining) {
        if (remaining == 0) {
            System.out.println(current);
            return;
        }
        generateOutcomes(current + "H", remaining - 1); // Heads
        generateOutcomes(current + "T", remaining - 1); // Tails
    }
}

