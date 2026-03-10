//write a program to create an array with 10 elements at least and find any number that is present or not and return a function if present it should give true or else give false

class valueinarrusingfunctioncall
{
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,8,9};
        int target=2; //false
        //int target=5; =>true
        System.out.println(value(arr,target ));    
    }
    public static boolean value(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++) //checks every element in arr lessthan arr length
        {
            if(arr[i]==target)   //checks every element if arr element is equal to target returns T r else F 
                return true;
            
        }  
        return false;
    }
}

