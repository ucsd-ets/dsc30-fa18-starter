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
 * data file, which contains the points we want to find their k nearest neighbors. The fourth one is a flag which
 * is either "withLabal" or "withoutLabel"
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
 * 1. If the fourth argument is "withLabel".
 *
 * The input data file should have the same format as training data file.
 * In this case we are trying to use input data file as validation data and find the validation error. This should
 * be done by counting number of times our classifier have made mistakes (number of "label mismatch" between our
 * predicted labels and actual labels in input data file) and divide it by the input data size. We can then decide
 * which K to choose based on the validation error.
 *
 * Your output file should contains the value of K and its corresponding validation error. For example,
 * if I choose K = 3 and the validation error is 0.1, then the output file should has a single line with:
 *
 * K: 3, Validation Error: 0.1
 *
 * 2. If the fourth argument is "withoutLabel".
 *
 * Each line of the input data file should only contains the features of this data, with no label following.
 * In this case we are trying to find the k nearest neighbors of the data in each line of input file.
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
 * @author Xindong Cai
 * @since 09-18-2018
 */
public class KNNClassifier {

    /**
     * The main method that drives this program.
     * @param args the command line argument
     */
    public static void main(String args[]) {
        // TODO

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

        // TODO

        return null;
    }

    /**
     * Find the most frequent label in array of points. Hint: you should use HashMap
     *
     * @param points the given array of points
     * @return the most frequent label
     */
    public static int mostFreqLabel(Point[] points) {
        // TODO

    }






}
