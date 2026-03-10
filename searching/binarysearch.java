//write a program to perform binary search algorithm.
//arr={0,1,2,3,4,5,6,7,8,9}
//target=7;
//mid value=5;
class binarysearch {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
       // int target = 8;
         int target=4;
        int result = binarySearch(arr, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            // int mid = low + (high - low) / 2; used efficiently
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid; //target found
            } 
            else if (arr[mid] < target) {
                low = mid + 1; // searches right half
            } 
            else {
                high = mid - 1; // searches left half
            }
        }
        return -1; 
    }
}


