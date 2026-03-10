import java.util.*;
class HashCode{
    private int size=10;
    private LinkedList<Integer>[] table;
   
     @SuppressWarnings("unchecked") 
    HashCode(){
    table=new LinkedList[size];
    for(int i=0;i<size;i++){
        table[i]=new LinkedList<Integer>();
    }
    } 

    //HASH function
    public int hash(int data){  //converting key values to index we use hash
    return data % 10; //here size=10
    }

    //INSERT function
    public void insert(int data){  //inserting data 
        int index=hash(data);   
        table[index].add(data);

    }

    //DISPLAY function
    public void dislay(){
        for( int i=0;i<size;i++){
            System.out.println(table[i]+" -> "+i);
            
        }
    }

    //SEARCH function
    public String search(int key){
        int index=hash(key);
        return "this data is there  " + table[index].contains(key);
    }

    //DELETION function
    public boolean delete(int data){
        int index=hash(data);
        return table[index].remove(Integer.valueOf(data));
    }
}
public class hashing{
    public static void main(String[] args) {
      HashCode h = new HashCode(); 
      h.insert(10);
      h.insert(20);
      h.insert(38);
      h.insert(45);
      h.insert(20);
      h.insert(13);
      h.insert(41);
      h.insert(19);
      h.dislay();

      System.out.println(h.search(10));

     h.delete(13);
     System.out.println("after deletion:-");
     h.dislay();
    }
}

