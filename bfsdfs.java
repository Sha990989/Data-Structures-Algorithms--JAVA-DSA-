import java.util.*;

public class bfsdfs{

    private Map<Integer, List<Integer>> adj = new HashMap<>();
    public void addNode(int v) {
        adj.putIfAbsent(v, new ArrayList<>());
    }
    public void addEdge(int u, int v) {
        adj.putIfAbsent(u, new ArrayList<>());
        adj.putIfAbsent(v, new ArrayList<>());

        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public void BFS(int data) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(data);
        visited.add(data);
        System.out.print("BFS:");
        while(!queue.isEmpty() ){
            int current = queue.poll();
            System.out.print(current + " ");
            for( int neighbor : adj.get(current)){
                if (!visited.contains(neighbor)){
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    private void DFSMethod(int data, Set<Integer> visited) {
        visited.add(data);
        System.out.print(data + " ");

        for (int neighbor : adj.get(data)) {
            if (!visited.contains(neighbor)) {
                DFSMethod(neighbor, visited);
            }
        }
    }
    public void DFS(int start){
        Set<Integer> visited = new HashSet<>();
        System.out.print("DFS: ");
        DFSMethod(start, visited);
        System.out.println();
    }
    public static void main(String[] args) {
        bfsdfs graph = new bfsdfs();
        graph.addEdge(1, 2);
        graph.addEdge(2, 1);
        graph.addEdge(3, 4);
        graph.addEdge(2,3);
        graph.addEdge(2, 4);
        graph.addEdge(9, 8);
        graph.addEdge(2, 6);
        graph.addEdge(4, 5);
        graph.addEdge(2, 4);
        
        graph.BFS(3);
        graph.DFS(2);
    }
}