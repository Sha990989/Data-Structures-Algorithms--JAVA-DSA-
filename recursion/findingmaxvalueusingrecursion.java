//write a program to find the maximum value by using recursion


class findingmaxvalueusingrecursion {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50 };
        System.out.println(max(arr,0));
    }
    public static int max(int[] arr,int index){ //arr AND index values are inputs
        if(index==arr.length-1){
            return arr[index];
        }
        return Math.max(arr[index],max(arr,index+1));
    }
}
