/**
 * Bloom filter implemented by using 3 independent hash functions.
 */
public class BloomFilter {
    public static final int NUMBITS = 8;

    byte[] table; // the hash table store in bits
    int size; // the number of slots (bits) in the hash table

    /**
     * The constructor that creates a bloom filter of given size in byte with 8 * tableSize slots.
     *
     * @param tableSize the given table size in byte
     */
    public BloomFilter(int tableSize) {

        //TODO
    }

    //TODO: Add three different good hash functions, remember to make them private

    /**
     * Insert a given string to bloom filter
     * @param str the given string
     */
    public void insert(String str) {

        //TODO
    }

    /**
     * Helper method to set a bit in the table to 1, which is specified by the given byteIndex 
     * and bitIndex
     * @param byteIndex the index of the byte in hash table
     * @param bitIndex the index of the bit in the byte at byteIndex. Range is [0, 7]
     */
    private void setBit(int byteIndex, int bitIndex) {
        // set the bit at bitIndex of the byte at byteIndex
        table[byteIndex] = (byte) (table[byteIndex] | ((1 << (NUMBITS - 1)) >> bitIndex));
    }

    /**
     * Find if a string could exist in bloom filter
     * @param str the given string
     * @return true if given string is "believed" to be in the hash table, false otherwise
     */
    public boolean find(String str) {
        
        //TODO
    }

    /**
     * Helper method to get the bit value at the slot, which is specified by the given byteIndex 
     * and bitIndex
     * @param byteIndex the index of the byte in hash table
     * @param bitIndex the index of the bit in the byte at byteIndex. Range is [0, 7]
     */
    private int getSlot(int byteIndex, int bitIndex) {
        return (table[byteIndex] >> ((NUMBITS - 1) - bitIndex)) & 1;
    }
}
