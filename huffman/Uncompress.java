import java.io.*;

/**
 * Uncompress the first given file to the second given file using Huffman coding
 */
public class Uncompress {
    private static final int EXP_ARG = 2; // number of expected arguments
    private static final int BYTE_BITS = 8; // number of bits in a byte
    private static final int NUM_CHAR = 256; // alphabet size of extended ASCII

    /**
     * Main method that drives the program. The first command line argument should be
     * the path of the file to be uncompressed. The second should be the path of the file
     * that's uncompressed to.
     *
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        // Check if the number of arguments is correct
        if (args.length != EXP_ARG) {
            System.out.println("Invalid number of arguments.\n" +
                    "Usage: ./uncompress <infile outfile>.\n");
            return;
        }

        FileInputStream inFile = new FileInputStream(args[0]);
        DataInputStream in = new DataInputStream(inFile);
        BitInputStream bitIn = new BitInputStream(in);

        FileOutputStream outFile = new FileOutputStream(args[1]);
        DataOutputStream out = new DataOutputStream(outFile);

        // TODO

        inFile.close();
        in.close();
        outFile.close();
        out.close();
        return;
    }
}
