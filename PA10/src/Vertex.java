import java.util.ArrayList;

public class Vertex {

    private String name; // the name of this vertex
    private int x; // the x coordinates of this vertex on map
    private int y; // the y coordinates of this vertex on map


    public ArrayList<Edge> adjacentEdges; // the adjacent edges of this vertex

    // TODO: add additional instance variables to work with Disjoint Set

    public Vertex(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        adjacentEdges = new ArrayList<>();

        // TODO: initialize your new instance variables
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // TODO: add getters and setters for your new instance variables

    public double getDistanceTo(Vertex o) {
        double squareDis = Math.pow(x - o.getX(), 2) + Math.pow(y - o.getY(), 2);
        return Math.sqrt(squareDis);
    }

    public void addEdge(Edge edge) {
        adjacentEdges.add(edge);
    }

    public String toString() {
        return name + " (" + x + ", " + y + ")";
    }

}