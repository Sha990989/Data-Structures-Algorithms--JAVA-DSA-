import java.util.*;
public class heroconnectiontask {
    private Map<String, List<String>> connections= new HashMap<>();
    public void addHero(String hero){
        connections.putIfAbsent(hero, new ArrayList<>());
    }
    public void addConnection(String hero1,String hero2){
        addHero(hero1);
        addHero(hero2);

        if(!connections.get(hero1).contains(hero2)){
            connections.get(hero1).add(hero2);
        }
        if(!connections.get(hero2).contains(hero1)){
            connections.get(hero2).add(hero1);
        }
    }
    public void showNetwork(){
        System.out.println("Movie  Heroes Fan Network:");
        for(String hero:connections.keySet()){
            System.out.println(hero+"->"+connections.get(hero));
        }
    }
    public boolean areConnected(String h1,String h2){
        return connections.containsKey(h1) && connections.get(h1).contains(h2);
    }
public void topPopularHero(){
    String top="";
    int max=-1;
    for(String hero:connections.keySet()){
        if(connections.get(hero).size()>max){
        max=connections.get(hero).size();
        top=hero;
    }
}
System.out.println("\n top Fan Network Hero="+top+"("+max+")");
}
public static void main(String[] args) {
    heroconnectiontask g = new heroconnectiontask();
    g.addConnection("Ramcharan", "Jr.NTR");
    g.addConnection("Ramcharan", "Mahesh Babu");
    g.addConnection("Prabhas", "Yash");
    g.addConnection("Allu Arjun", "Mahesh babu");
    g.addConnection("Vijay", "Allu Arjun");
    g.addConnection("Prabhas","Ramcharan");
    g.showNetwork();
    g.topPopularHero();

}
}