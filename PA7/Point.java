/**
 * The Point class which defines a data with n-dimensional features with its label
 *
 */
public class Point implements Comparable<Point> {

    private static final int POWER = 2;

    private double[] features; // array containing all features of this point
    private int numDim; // number of dimension of this point
    private int label; // label of this point
    private double squareDisToQueryPoint;

    /**
     * The constructor that creates a point with features and certain label.
     * 
     * @param features the given features of this point
     * @param label the label of this point
     */
    public Point(double[] features, int label) {
        this.features = features;
        this.numDim = features.length;
        this.label = label;
    }

    /**
     * The constructor that creates a point with features but without label.
     *
     * @param features the given features of this point
     */
    public Point(double[] features) {
        this.features = features;
        this.numDim = features.length;
    }

    /**
     * Getter for the features of this point
     * 
     * @return the features of this point
     */
    public double[] getFeatures() {
        return features;
    }

    /**
     * Getter for the label of this point
     *
     * @return the label of this point
     */
    public int getLabel() {
        return label;
    }

    /**
     * Getter for number of dimension
     *
     * @return the number of dimension of this point
     */
    public int getNumDimension() {
        return numDim;
    }

    /**
     * Returns the value at the given dimension of the features in this point
     *
     * @param dimension the given dimension
     * @return the value at the given dimension of the features in this point
     */
    public double valueAt(int dimension) {
        return features[dimension];
    }

    /**
     * Set the square distance to current query point
     *
     * @param queryPoint current query point
     */
    public void setSquareDisToQueryPoint(Point queryPoint) {
        double result = 0;
        // Add square of difference for each dimension
        for (int i = 0; i < numDim; i++) {
            result += Math.pow(this.valueAt(i) - queryPoint.valueAt(i), POWER);
        }

        this.squareDisToQueryPoint = result;
    }

    /**
     * Getter for square distance to current query point
     * @return square distance to current query point
     */
    public double getSquareDisToQueryPoint() {
        return squareDisToQueryPoint;
    }

    /**
     * Method used in priority queue. Point with larger squareDisToQueryPoint will have higher priority
     * @param o the other point
     * @return positive int if squareDisToQueryPoint of this node is smaller than squareDisToQueryPoint of other node,
     *         negative int if squareDisToQueryPoint this node is larger than squareDisToQueryPoint of other node,
     *         0 if squareDis of this node equal to squareDis of other node,
     */
    public int compareTo(Point o) {
        return Double.compare(o.squareDisToQueryPoint, squareDisToQueryPoint);
    }

    /**
     * Return true if this point is equal to the given point. Otherwise, return false.
     * Two points with same dimensions are equal if they have the same value in every dimension.
     *
     * @param o the given point
     * @return true if this point is equal to the given point. Otherwise, return false.
     */
    public boolean isEqual(Point o) {
        for (int i = 0; i < numDim; i++) {
            if (features[i] != o.valueAt(i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns a string representing the given point. For example, if a point with 2 dimensions (72.7, 62.5)
     * has label 1, the returned string should be: (72.7, 62.5) : 1
     *
     * @return a string representing the given point.
     */
    public String toString() {
        String s = "(";
        for (int i = 0; i < numDim - 1; i++) {
            s += features[i] + ", ";
        }
        s += features[numDim - 1] + ") : " + label;

        return s;
    }
}
