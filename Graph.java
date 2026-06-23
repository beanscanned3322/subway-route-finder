import java.util.*;

public class Graph {

    Map<Station, List<Edge>> adjList = new HashMap<>();

    public void addStation(Station s) {
        adjList.putIfAbsent(s, new ArrayList<>());
    }

    public void addEdge(Station from, Station to, int weight) {
        adjList.get(from).add(new Edge(to, weight));
        adjList.get(to).add(new Edge(from, weight));
    }

    public void printGraph() {
        for (Station s : adjList.keySet()) {
            System.out.print(s + " -> ");
            for (Edge e : adjList.get(s)) {
                System.out.print(e.to + "(" + e.weight + ") ");
            }
            System.out.println();
        }
    }
}
