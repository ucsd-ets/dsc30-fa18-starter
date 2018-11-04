/**
 * The Point class which defines an n-dimensional data point with its label
 *
 * @author TODO
 * @since TODO
 */
public class Point {

    private static final int POWER = 2;

    private double[] point; // array containing all coordinates (features) of this point
    private int numDimension; // number of features of this point
    private int label; // label of this point

    /**
     * The constructor that creates a data point with certain label.
     * 
     * @param point the n-dimensional data point
     * @param label the label of this point
     */
    public Point(double[] point, int label) {
        // TODO
    }

    /**
     * The constructor that creates a data point without label. The data point needs to be 
     * classified later.
     *
     * @param point the n-dimensional data point
     */
    public Point(double[] point) {
        // TODO
    }

    /**
     * Getter for data point array
     * 
     * @return this data point array
     */
    public double[] getPoint() {
        return point;
    }

    /**
     * Getter for label
     *
     * @return label of this point
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
        return numDimension;
    }

    /**
     * Returns the value at the given dimension of this point
     *
     * @param dimension the given dimension
     * @return the value at the given dimension of this point
     */
    public double valueAt(int dimension) {
        // TODO
        return 0.0;
    }

    /**
     * Return true if this point is equal to the given point. Otherwise, return false.
     * Two points with same number of dimensions are equal if they have the same value 
     * in every dimension.
     *
     * @param o the given point
     * @return true if this point is equal to the given point. Otherwise, return false.
     */
    public boolean isEqual(Point o) {
        // TODO
        return false;
    }

    /**
     * Computes the square distance of two given points.
     *
     * @param p1 the first point
     * @param p2 the second point
     * @return the square distance of two given points.
     */
    public static double squareDistance(Point p1, Point p2) {
        // TODO
        return 0.0;
    }

    /**
     * Returns a string representing the given point. For example, if a point with 2 dimensions (72.7, 62.5)
     * has label 1, the returned string should be: (72.7, 62.5) : 1
     *
     * @return a string representing the given point.
     */
    public String toString() {
        // TODO
    }

}
