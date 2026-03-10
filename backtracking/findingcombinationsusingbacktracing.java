package backtracking;
//create an array arr={1,2,3} use backktracing ->find the number of combinations   
//6 combinations

/*1 2 3 
1 2  
1  3
1
 2 3
 2
  3 */


public class findingcombinationsusingbacktracing {   //i.e printing single subsets
  public static void SingleSubset(int[] arr,int index,String current)
  {
    if(arr.length==index){
        System.out.println(current);
        return;
    }
    SingleSubset(arr, index+1, current+arr[index]+" "); //output:- 1 2 3
    SingleSubset(arr, index+1, current+" ");
    
  }
    
    
    public static void main(String[] args) {
        int[] arr = {1, 2,3};
        SingleSubset(arr, 0, "");
    }
}
