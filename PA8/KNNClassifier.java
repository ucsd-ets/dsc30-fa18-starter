import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Implementation of KNN classifier using KD tree.
 *
 * This program takes in 4 command line arguments and outputs a file called "result.txt". The first command line is
 * the choice of K as in KNN. The second one is the name of the training data file. The third one is the name of input
 * data file. The fourth one is a flag which is either "validation" or "test"
 *
 * Training data file:
 *
 * Each line of the training data file is a data. It should have number of d features (double)
 * following by a single label (int). All these number should be separated by space.
 * For example, if d = 3, each line of training data file should has the format:
 *
 * 7.27 6.25 6.12 1
 *
 * Where "7.27 6.25 6.12" is 3 features of this data, and "1" is the label of this data.
 *
 * Input data file:
 *
 * 1. If the fourth argument is "validation".
 *
 * The input data file should have the same format as training data file.
 * In this case we are trying to use input data file as validation data and find the validation error. This should
 * be done by counting number of times our classifier have made mistakes (number of "label mismatch" between our
 * predicted labels and actual labels in input data file) and divide it by the input data size. We can then decide
 * which K to choose based on the validation error.
 *
 * Your output file should contains the value of K and its corresponding validation error. For example,
 * if we choose K = 3 and the validation error is 0.1, then the output file should has a single line with:
 *
 * K: 3, Validation Error: 0.1
 *
 * 2. If the fourth argument is "test".
 *
 * Each line of the input data file should only contains the features of this data, with no label following.
 * In this case we are trying to use input data file as test data and find the k nearest neighbors of data 
 * in each line of input file.
 *
 * Each line of your output file should contains the predicted label for the data in the corresponding line of input
 * data file. For example, if input file has 2 lines of data, and your KNN classifier predict that the label for both
 * of those data is 1. Then your output file should have two lines as the following:
 *
 * 1
 * 1
 *
 * Please refer to the write up for more details
 *
 */
public class KNNClassifier {

    private static final int FLAG_INDEX = 3;

    /**
     * The main method that drives this program.
     * @param args the command line argument
     */
    public static void main(String args[]) {
        int k = Integer.parseInt(args[0]);
        String flag = args[FLAG_INDEX];

        // TODO: read the training data and use it to build KNN training data
        
        if (flag.equals("validation")) {
            // if data file is with label, it contains validation data
            Point[] validationData;
            int errorCount = 0;

            // TODO: compute the validation error

            double errorPercent = (double) errorCount / validationData.length;
            System.out.println("K: " + k + ", Validation Error: " + errorPercent);
        }
        else { 
            // data file is test data, it contains data that we want to find KNN
            //TODO
        }

    }

    /**
     * Read the data from file, and convert them to array of points. If withLabel is true, the returned
     * points will have label. If withLabel is false, the returned Points won't have labels.
     *
     * @param fileName the given file to read
     * @param withLabel if the input data has label
     * @return array of data points
     */
    public static Point[] readData(String fileName, boolean withLabel) {
        try {
            // get number of data points by counting total lines
            long lineCount = Files.lines(Paths.get(fileName)).count();
            Point[] result = new Point[(int)lineCount];
            int curIndex = 0;

            Scanner sc = new Scanner(new File(fileName));
            while (sc.hasNextLine()) {
                // split each line into data string array by space
                String[] dataStrings = sc.nextLine().split(" ");
                int numDimension = withLabel ? dataStrings.length - 1 : dataStrings.length;
                double[] features = new double[numDimension];

                // convert each string in data strings to double, and put it into features array
                for (int i = 0; i < numDimension; i++) {
                    features[i] = Double.parseDouble(dataStrings[i]);
                }
                if (withLabel) {
                    // if data is with label, add point with label to result
                    int label = Integer.parseInt(dataStrings[dataStrings.length - 1]);
                    result[curIndex++] = new Point(features, label);
                }
                else {
                    // data is without label, add point with no label to result
                    result[curIndex++] = new Point(features);
                }
            }
            return result;
        }
        catch (IOException e) {
            System.out.println("File not found!");
        }
        return null;
    }

    /**
     * Find the most frequent label in array of points
     *
     * @param points the given array of points
     * @return the most frequent label
     */
    public static int mostFreqLabel(Point[] points) {

        HashMap<Integer, Integer> countMap = new HashMap<>();

        // TODO
    }

}
