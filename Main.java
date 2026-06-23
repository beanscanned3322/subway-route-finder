import java.util.*;

public class Main {
    public static void main(String[] args) {

        Graph g = new Graph();

        Station a = new Station("Times Square");
        Station b = new Station("Union Square");
        Station c = new Station("Central Park");
        Station d = new Station("Brooklyn");

        g.addStation(a);
        g.addStation(b);
        g.addStation(c);
        g.addStation(d);

        g.addEdge(a, b, 5);
        g.addEdge(b, c, 3);
        g.addEdge(a, c, 10);
        g.addEdge(c, d, 8);

        List<Station> path = BFS.findPath(g, a, d);

        System.out.println("Shortest path (fewest stops):");
        for (Station s : path) {
            System.out.print(s + " -> ");
        }
    }
}