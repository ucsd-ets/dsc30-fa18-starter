import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Implementation of KD tree which will be used in a KNN classifier
 */
public class KDTree {

    private KDNode root; // root of this KD tree
    private int numDim; // number of dimension of given data points
    private int k; // number of nearest neighbors to find
    private double largestDisInKNN;// largest distance to current query point in the current KNN
    private PriorityQueue<Point> KNN; // priority queue containing k nearest neighbors
    private int size;
    private int height;

    /**
     * Inner class which defines a KD node
     */
    protected class KDNode {

        KDNode left;
        KDNode right;
        KDNode parent;
        Point point; // the data point in this node

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
         * @param right the right child to be set
         */
        public void setRight(KDNode right) {
            this.right = right;
        }

        /**
         * Getter for parent
         * @return the parent of this node
         */
        public KDNode getParent() {
            return parent;
        }

        /**
         * Setter for parent
         * @param parent the parent to be set
         */
        public void setParent(KDNode parent) {
            this.parent = parent;
        }

        /**
         * Getter for point in this node
         * @return the point in this node
         */
        public Point getPoint() {
            return point;
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
     * @param points the given set of points to build the KD tree
     */
    public void build(Point[] points) {

        // TODO
    }

    /**
     * Find k nearest neighbors of the given query point
     *
     * @param queryPoint the given query point
     * @param k number of nearest neighbors
     * @return an array containing k nearest neighbors
     */
    public Point[] findKNearestNeighbor(Point queryPoint, int k) {

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
     * Update current KNN with given point. To keep KNN with only K smallest distance points to
     * the current query point, when size of current KNN reaches K, it will only add
     * the given point to current KNN if the square distance from given point to query point
     * is smaller than largestDisInKNN.
     *
     * The size of KNN should stay as K once it reaches K for the first time.
     *
     * @param p the given data point to update if possible
     */
    private void updateKNN(Point p) {

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
