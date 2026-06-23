import java.util.*;

public class BFS {

    public static List<Station> findPath(Graph graph, Station start, Station end) {

        Queue<Station> queue = new LinkedList<>();
        Map<Station, Station> parent = new HashMap<>();
        Set<Station> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);
        parent.put(start, null);

        while (!queue.isEmpty()) {
            Station current = queue.poll();

            if (current.equals(end)) {
                break;
            }

            for (Edge edge : graph.adjList.get(current)) {
                Station neighbor = edge.to;

                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    parent.put(neighbor, current);
                    queue.add(neighbor);
                }
            }
        }

        List<Station> path = new ArrayList<>();
        Station step = end;

        while (step != null) {
            path.add(step);
            step = parent.get(step);
        }

        Collections.reverse(path);

        return path;
    }
}