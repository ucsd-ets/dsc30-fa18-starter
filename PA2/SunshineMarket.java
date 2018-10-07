public class SunshineMarket {
    // Example customers
    private static int[] customers1 = {3, 7, 20};
    private static int[] customers2 = {1, 3, 5, 4, 16, 8};
    private static int[] customers3 = {1, 1, 2, 3, 5, 7};

    private static QueueADT customersQueue;
    private static QueueADT[] lines;

    public static void main(String[] args) {
        // Run your program here to test the results
    }

    public static String lines(int[] customers,int numberOfLines) {
        int totalTime = 0;
        int emptyQueueTime = 0;

        // TODO

        return "With " + numberOfLines + " lines, the total wait time was "
                + totalTime + " time units, and registers were idle for a total of "
                + emptyQueueTime + " time units.\n";
    }

    private static boolean allQueuesEmpty() {
        // TODO

        return false;
    }

    private static QueueADT getShortestLine() {
        // TODO

        return null;
    }
}
