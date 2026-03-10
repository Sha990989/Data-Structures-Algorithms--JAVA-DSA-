class bubblesort {
  public static void main(String[] args) {
    int[] arr = {3, 6, 7, 9, 5, 8, 0, 1, 2, 4};

    System.out.println("Before sorting:");
    for (int j : arr) {
      System.out.print(j + " ");
    }

    bubbleSort(arr);

    System.out.println();
    System.out.println("After sorting:");
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static void bubbleSort(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) { 
        /*//n-i-1 reduces the time complexity i.e.,it stops while sorting ends
        if (arr[j] < arr[j + 1]) {  //descending order
            //if (arr[j] > arr[j + 1]) {  //ascending order */
            
        if (arr[j] < arr[j + 1]) {  // Descending order
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }

      // Print array after each pass
      System.out.println();
      for (int k : arr) {
        System.out.print(k + " ");
      }
    }
  }
}


