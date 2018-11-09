/**
 * Compare the runtime of NaiveKNN and KDTree
 */
public class RuntimeComparison {
    public static int MIN_RANDOM = 0; // the min value for random numbers
    public static int MAX_RANDOM = 100; // the max value for random numbers

    public static int NUM_DIM; // number of dimensions
    public static int TRAINING_SIZE; // the size of the training data
    public static int TEST_SIZE; // the size of the test data to find KNN
    public static int K; // number of nearest neighbors to find

    /**
     * Main method that drives the program
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        KDTree kdt = new KDTree(NUM_DIM);
        NaiveKNN naiveKNN = new NaiveKNN();

        // Get certain number of random training data with given number of dimension
        Point[] trainingPoints = buildRandomPoints(TRAINING_SIZE, NUM_DIM);

        // Get certain number of random test data with given number of dimension
        Point[] testPoints = buildRandomPoints(TEST_SIZE, NUM_DIM);

        kdt.build(trainingPoints);
        long startTime = System.currentTimeMillis();
        for (Point p : testPoints) {
            kdt.findKNearestNeighbor(p, K);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("For training data of size " + TRAINING_SIZE + ", dimensions of size " + NUM_DIM +
                           ", runtime for finding " + TEST_SIZE + " " + K + "-nearest neighbors in KDTree is: " +
                           (endTime - startTime) + " milliseconds");

        naiveKNN.build(trainingPoints);
        startTime = System.currentTimeMillis();
        for (Point p : testPoints) {
            naiveKNN.findKNearestNeighbor(p, K);
        }
        endTime = System.currentTimeMillis();
        System.out.println("For training data of size " + TRAINING_SIZE + ", dimensions of size" + NUM_DIM +
                           ", runtime for finding " + TEST_SIZE + " " + K + "-nearest neighbors in NaiveKNN is: " +
                           (endTime - startTime) + " milliseconds");
    }

    /**
     * Returns an array of points containing random features.
     *
     * @param numPoints the number of points we want
     * @param numDim the number of dimension of the data points (number of features of data point)
     * @return an array of points containing random features.
     */
    public static Point[] buildRandomPoints(int numPoints, int numDim) {
        Point[] randPoints = new Point[numPoints];
        for (int i = 0; i < numPoints; i++) {
            double[] randNums = randomNumbers(numDim, MIN_RANDOM, MAX_RANDOM);
            randPoints[i] = new Point(randNums);
        }
        return randPoints;
    }

    /**
     * Returns an array of random numbers
     *
     * @param size the number of random numbers wanted
     * @param min the min value for random number
     * @param max the max value for random number
     * @return an array of random numbers
     */
    public static double[] randomNumbers(int size, int min, int max) {
        double[] randNums = new double[size];
        for (int i = 0; i < size; i++) {
            randNums[i] = (Math.random() * ((max - min) + 1)) + min;
        }
        return randNums;
    }

}
