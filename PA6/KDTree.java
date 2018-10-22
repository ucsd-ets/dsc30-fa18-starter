import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Implementation of KD tree which will be used in a KNN classifier
 *
 * @author TODO
 * @since TODO
 */
public class KDTree {

    private static final int DIVISOR = 2;
    private KDNode root; // root of this KD tree
    private int numDim; // number of dimension of given data points
    private int k; // number of nearest neighbors to find
    private KDNode kthSmallestNodeInKNN;// Node with kth smallest distance to current query point in current KNN
    private PriorityQueue<KDNode> KNN; // priority queue containing exactly k nearest neighbors
    private int size;
    private int height;

    /**
     * Inner class which defines a KD node
     */
    protected class KDNode implements Comparable<KDNode> {

        KDNode left;
        KDNode right;
        KDNode parent;
        Point point; // the data point in this node
        double squareDis; // square distance from point in this node to the current query point

        /**
         * Default constructor to create an empty KD node
         */
        KDNode() {}

        /**
         * Constructor which creates a KD node containing the given point
         *
         * @param point the given point
         */
        KDNode(Point point) {
            this.point = point;
        }

        /**
         * Getter for left child
         *
         * @return the left child of this node
         */
        public KDNode getLeft() {
            return left;
        }

        /**
         * Setter for left child
         *
         * @param left the left child to be set
         */
        public void setLeft(KDNode left) {
            this.left = left;
        }

        /**
         * Getter for right child
         *
         * @return the right child of this node
         */
        public KDNode getRight() {
            return right;
        }

        /**
         * Setter for right child
         *
         * @param right the right child to be set
         */
        public void setRight(KDNode right) {
            this.right = right;
        }

        /**
         * Getter for parent
         *
         * @return the parent of this node
         */
        public KDNode getParent() {
            return parent;
        }

        /**
         * Setter for parent
         *
         * @param parent the parent to be set
         */
        public void setParent(KDNode parent) {
            this.parent = parent;
        }

        /**
         * Getter for point in this node
         *
         * @return the point in this node
         */
        public Point getPoint() {
            return point;
        }

        /**
         * Getter for the square distance from point in this node to the current query point
         *
         * @return the square distance from point in this node to the current query point
         */
        public double getSquareDis() {
            return squareDis;
        }

        /**
         * Setter for the square distance from point in this node to the current query point
         *
         * @param squareDis the square distance to be set
         */
        public void setSquareDis(double squareDis) {
            this.squareDis = squareDis;
        }

        /**
         * Method used in priority queue. KDNode with smaller squareDis will have higher priority
         *
         * @param o the other KDNode
         * @return positive int if squareDis of this node is larger than squareDis of other node,
         *         negative int if squareDis of this node is smaller than squareDis of other node,
         *         0 if squareDis of this node equal to squareDis of other node,
         */
        public int compareTo(KDNode o) {
            return Double.compare(squareDis, o.squareDis);
        }
    }

    /**
     * Constructor which creates a KD tree. Need to specify the number of dimension of data points
     * from the parameter.
     *
     * @param numDim the number of dimension
     */
    public KDTree(int numDim) {
        // TODO
    }

    /**
     * Build the KD tree from the given set of points
     *
     * @param points the given set of points to build the KD tree
     */
    public void build(Point[] points) {
        // TODO
    }

    /**
     * Helper method to recursively build the subtree of KD tree.
     *
     * @param points the given set of points to build the KD tree
     * @param start the starting index of the points array used to build the subtree
     * @param end the non-inclusive index of the points array used to build the subtree
     * @param d the current dimension to looked at
     * @param height the current height of the kd tree,
     *               update this height if current height is larger
     * @return the parent of the subtree
     */
    private KDNode buildSubtree(Point[] points, int start, int end, int d, int height) {
        // TODO
        return null;
    }

    /**
     * Find k nearest neighbors of the given query point
     *
     * @param point the given query point
     * @param k number of nearest neighbors
     * @return an array containing k nearest neighbors
     */
    public Point[] findKNearestNeighbor(Point point, int k) {
        // TODO
        return null;
    }

    /**
     * Helper method to recursively find the K nearest neighbors
     *
     * @param n the current node to look at
     * @param queryPoint the given point to find its KNN
     * @param d the current dimension to look at
     */
    private void findKNNHelper(KDNode n, Point queryPoint, int d) {
        // TODO
    }

    /**
     * Helper method to update the priority queue KNN using the given KD node.
     * It also updates the maxDisInKNN based when necessary.
     *
     * @param n the given KD node
     */
    private void updateKNN(KDNode n) {
        // TODO
    }

    /**
     * Helper method to return the node with kth smallest distance in priority queue KNN.
     *
     * @return the node with kth smallest distance in priority queue KNN.
     */
    private KDNode findkthSmallestNodeInKNN() {
        // TODO
    }

    /**
     * Returns the size of this KD tree
     * @return the size of this KD tree
     */
    public int size() {
        return size;
    }

    /**
     * Returns the height of this KD tree
     * @return the height of this KD tree
     */
    public int height() {
        return height;
    }


}
