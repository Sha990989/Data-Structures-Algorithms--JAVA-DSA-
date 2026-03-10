//write a program to perform linear search algorithm.

class linearsearch {
public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7,8,9};
   // int target=11; returns -1
    int target=7; //returns 6
    System.out.println(linearSearch(arr,target));

}
public static int linearSearch(int[] arr,int target){
    int i=0;
    while(i<arr.length){
        if(arr[i]==target){
            return i;
        }
        i++;
    }
    return -1;
}
}
