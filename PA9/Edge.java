
public class Edge {

    public double distance; // the distance from source to target
    public Vertex source; // the source vertex this edge starts from
    public Vertex target; // the target vertex this edge ends at

    public Edge(Vertex vertex1, Vertex vertex2, double weight) {
        source = vertex1;
        target = vertex2;
        this.distance = weight;
    }

    public String toString() {
        return source + " - " + target;
    }
}