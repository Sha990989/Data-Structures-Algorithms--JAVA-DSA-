import java.util.*;
public class graph{
    private Map<Integer, List<Integer>> adjacencyList;
  public graph(){   //this is a constructor here
  adjacencyList = new HashMap<>(); //object creation
  }
 public void addNode(int v){ //adding value
    adjacencyList.putIfAbsent(v,new ArrayList<>()); // putIfAbsent is a built-in function in map and v is the key and ArrayList is the value pair used to store list of data in array format
    for(int node : adjacencyList.keySet())
    {
        if(node!=v)   // key value pair should not be same
        {  
            addEdge(node,v);
        }
    }
}
public void addEdge(int u,int v){
if(!adjacencyList.containsKey(u))  addNode(u); //incase not connected means 
if(!adjacencyList.containsKey(v))  addNode(v); //containsKey is in-built function

if(!adjacencyList.get(u).contains(v)) adjacencyList.get(u).add(v);
if(!adjacencyList.get(v).contains(u)) adjacencyList.get(v).add(u);
}
public void DisplayGraph(){
    for(int v:adjacencyList.keySet()){   // v is key 
     System.out.println(v+"->"+adjacencyList.get(v));
    } 
}
public boolean isConnected(int v,int u){  //here v is key and u is value  {if inputs are 2 3 5 6 7 then 8,7 and 6,7 is connected are not we we will check}
if(adjacencyList.containsKey(v) && adjacencyList.get(v).contains(v)){
    return true;
}
return false;
}

public void removeConnection(int v,int u){
    if(adjacencyList.containsKey(v)){
        adjacencyList.get(v).remove(Integer.valueOf(u)); 
    }
    if(adjacencyList.containsKey(u)){
        adjacencyList.get(u).remove(Integer.valueOf(v));
    }
}
public int countEdges() {
    int count = 0;
    for (int node : adjacencyList.keySet()) {
        count += adjacencyList.get(node).size();
    }
    return count / 2; // because each edge counted twice
}
public int countNodes(){
    //  return adjacencyList.size();      or below code can also be used
    int count=0;               
    for(int node:adjacencyList.keySet()){
        count++;
    }
    return count;
}
public void countOfAdj(){
    int count=0;
    for(int v:adjacencyList.keySet()){
        count=adjacencyList.get(v).size();
        System.out.println(v+" : "+count);
    }
    return;
}

public static void main(String[] args) {
    graph g = new graph();  //object creation for class graph
    g.addNode(6);
    g.addNode(1);
    g.addNode(3);
    g.addNode(5);
    g.addNode(1);
    g.addNode(8);
    g.addEdge(1, 5);
    g.addEdge(5, 8);
    g.addEdge(1, 3);

    System.out.println("Displaying graph:");
    g.DisplayGraph();

    System.out.println("Total number of Edges: " + g.countEdges());

    System.out.println("Total number of Nodes: " + g.countNodes());

    System.out.println("count of adjacent nodes:");  // counts the number of nodes connected to that node
    g.countOfAdj();

    System.out.println("Is 1 connected to 5? " + g.isConnected(1, 5));
    System.out.println("After performing connection operation:");
    g.DisplayGraph();

    g.removeConnection(1, 8);
    System.out.println("After removing connection operation:");
    g.DisplayGraph();

}
}