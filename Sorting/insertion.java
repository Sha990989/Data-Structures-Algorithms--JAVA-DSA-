class insertion {
    public static void main(String[] args) {
        int[] arr={3,4,5,7,6,2,1,9,8};
        insertionsort(arr);
        for(int i:arr){
        System.out.print(i+" ");
    }   
    }
    public static void insertionsort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>min){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=min;
            }

        }
}
