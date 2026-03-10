class insertionsort {
   public static void main(String[] args) {
    int [] arr={3,4,5,7,6,2,1,9,8};
    for(int j:arr){
        System.out.print(j+" ");
    }
    insertion(arr);
    System.out.println();
    for(int i:arr){
        System.out.print(i+" ");
    }   
    
   }   
   public static void insertion(int[] arr){
    int n=arr.length;
    for(int i=0;i<n;i++){
        int min=arr[i];
        int j=i-1;
        /*for(int j=i-1;j>=0&&arr[j]<min;j--)
        {
            arr[j+1]=arr[j];
        }
            arr[j+1]=min; */
        while(j>=0 && arr[j]>min){
            arr[j+1]=arr[j];
            j=j-1;
        }        
        arr[j+1]=min;
    }
   }
}
