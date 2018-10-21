
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.AbstractList;

/**
 * This class will explore the runtime of the method getNameCounts, and compare the performance
 * of LinkedList with MRUList. The method getNamesCounts returns an LinkedList of Pair, which
 * contains names with count of each name that appears in Pride And Prejudice.
 *
 * This class will also explore the runtime of three sorting algorithm: Insertion Sort, Merge
 * Sort and Quick Sort, by comparing the time it takes to sort the list of Pair returned 
 * by getNamesCounts
 *
 */
public class RuntimeExplorer {

    // TODO: You will need many constant variables declared here, always specify their meanings

    // Then other non-constant variables, specify their meaning when necessary
    static String prideAndPrejudice = "./src/PrideAndPrejudice.txt";

    static String smallNames = "./src/SmallNames.txt";
    static String mediumNames = "./src/MediumNames.txt";
    static String largeNames = "./src/LargeNames.txt";

    /**
     * The main method that drives the RuntimeExplorer. 
     * Requirement: 
     * 1. To help you establish good coding habits, in this assignment, you can only 
     * delare local variables and call other methods in main. You should leave all the 
     * implementaion part in your other methods, as this will keep your main method 
     * short and clear. You will lose style points if this requirement is not met.
     * 2. Avoid magic number.
     *
     * @param args the command line arguments
     */
    public static void main(String [] args) {

        // TODO
    }

    /**
     * This method will read the names from the given file and store them into an LinkedList or
     * MRUList based on the given boolean useMRU.
     *
     * @param fileName the given file to be read
     * @param useMRU if true, store names into MRUList. Otherwise, store names into LinkedList
     * @return an LinkedList or MRUList containing all the names from the given file
     */
    public static AbstractList<String> readNames(String fileName, boolean useMRU){

        // TODO
        return null;
    }

    /**
     * This method will read certain number of words from the given file and store them into
     * an ArrayList
     *
     * @param fileName the given file to be read
     * @param numWords the number of words to read from given file
     * @param readAll if true, read all words from given file. Otherwise, only read numWords
     * @return an ArrayList containing all the words from the given file
     */
    public static ArrayList<String> readFile(String fileName, int numWords, boolean readAll){

        // TODO
        return null;
    }

    /**
     * This method would return an ArrayList of pair. Each pair will contain a name from names 
     * list with its number of occurrence in the ArrayList words. You must implement this method 
     * as efficient as possible to save time later. Hint: consider using break or iterators 
     * to make it run faster
     *
     * @param names the given names to find number of occurrence in words
     * @param words the given words from Pride and Prejudice
     * @return an ArrayList of Pair, which contains names with count of each name
     */
    public static ArrayList<Pair> getNameCounts(AbstractList<String> names,
                                                ArrayList<String> words) {
        // TODO

        return null;
    }

    /**
     * Print run time of getNameCounts with different parameters. The only method you should time
     * is getNamesCounts(). (See details below)
     *
     * @param listType LinkedList or MRUList which will be used in getNameCounts()
     * @param fileName the input file which contains names
     * @param startSize the initial size of words from Pride and Prejudice
     * @param incSize the increased size for each time we run the test
     * @param numTest the total number of tests we need to run
     * @param eachTestTimes the number of times we run each test to take average runtime
     */
    public static void printRunTime(String listType, String fileName,
                                    int startSize, int incSize, int numTest, int eachTestTimes) {

        System.out.println("Class: " + listType + " (" + fileName + ")");
        System.out.println("=================================");

        // Example of how to time your program

        long startTime = System.currentTimeMillis();

        // The program that you time goes here

        long endTime = System.currentTimeMillis();
        long totalTime = startTime - endTime;

        // TODO 

        // print new line after each test
        System.out.print("\n");
    }

    /**
     * Print the time it takes to sort nameCounts using Insertion Sort, Merge Sort or Quick Sort,
     * based on the given string sortAlg. 
     *
     * @param sortAlg if equals "QuickSort", use Quick Sort. If equals "MergeSort", use Merge Sort.
     *                If equals "InsertionSort", use Insertion Sort.
     * @param eachTestTimes the number of times we run each test to take average runtime
     * @return a sorted LinkedList of Pair, which contains names with count of each name. The pairs 
     *         should be in increasing order of name counts in pairs.
     */
    public static ArrayList<Pair> printSortsTime(String sortAlg, int eachTestTimes) {
        
        long totalTime = 0;

        System.out.println("Sorting nameCounts using " + sortAlg);

        // TODO 

        System.out.println(sortAlg + " takes " + totalTime + " nanoseconds to sort nameCounts\n");
        return null;
    }

    /**
     * Print the main character, the second main character and the third main character
     * in Pride and Prejudice
     *
     * @param sorted a sorted LinkedList of Pair, which contains names with count of each name.
     */
    public static void printCharacterQuestion(ArrayList<Pair> sorted) {
        // TODO: change the variables below to proper value
        String mainChar = "";
        String secondChar = "";
        String thirdChar = "";

        System.out.println("In Pride and Prejudice: ");
        System.out.println("The main character is " + mainChar);
        System.out.println("The second main character is " + secondChar);
        System.out.println("The third main character is " + thirdChar);
    }
}
