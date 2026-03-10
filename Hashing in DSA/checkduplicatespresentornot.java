
    import java.util.HashSet;

public class checkduplicatespresentornot {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 4, 5, 5};

        HashSet<Integer> set = new HashSet<>();

        boolean hasDuplicate = false;

        for (int num : arr) {
            // if add() returns false → element already exists → duplicate found
            if (!set.add(num)) {
                hasDuplicate = true;
                break;    // no need to check further
            }
        }

        if (hasDuplicate) {
            System.out.println("Yes, it contains duplicates.");
        } else {
            System.out.println("No, all values are unique.");
        }
    }
}

