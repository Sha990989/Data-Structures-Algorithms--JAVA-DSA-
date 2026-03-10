import java.util.*;

public class funtask{
    private Map<String, List<String>> graph;

    public funtask() {
        graph = new LinkedHashMap<>();  // keeps insertion order
    }

    public void addActor(String name) {
        graph.putIfAbsent(name, new ArrayList<>());
    }

    public void addConnection(String a, String b) {
        graph.get(a).add(b);
    }

    public void display() {
        for (String actor : graph.keySet()) {
            System.out.println(actor + " -> " + graph.get(actor));
        }
    }

    public static void main(String[] args) {

        funtask g = new funtask();

        g.addActor("Ram Charan");
        g.addActor("Jr. NTR");
        g.addActor("Mahesh Babu");
        g.addActor("Prabhas");
        g.addActor("Yash");
        g.addActor("Allu Arjun");
        g.addActor("Vijay");

        g.addConnection("Ram Charan", "Jr. NTR");
        g.addConnection("Ram Charan", "Mahesh Babu");
        g.addConnection("Ram Charan", "Prabhas");

        g.addConnection("Jr. NTR", "Ram Charan");

        g.addConnection("Mahesh Babu", "Ram Charan");
        g.addConnection("Mahesh Babu", "Allu Arjun");

        g.addConnection("Prabhas", "Yash");
        g.addConnection("Prabhas", "Ram Charan");

        g.addConnection("Yash", "Prabhas");

        g.addConnection("Allu Arjun", "Mahesh Babu");
        g.addConnection("Allu Arjun", "Vijay");

        g.addConnection("Vijay", "Allu Arjun");

        g.display();
    }
}
