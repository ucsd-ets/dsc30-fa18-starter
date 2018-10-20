/**
 * This class defines a pair where the first element is a word and second element is the
 * number of occurrence of this word.
 */
public class Pair{

    String word;
    int count;

    /**
     * The constructor that creates a pair of the given word with number of occurrence as 1.
     *
     * @param word the given word
     */
    public Pair(String word){
        this.word = word;
        this.count = 1;
    }

    /**
     * The constructor that creates a pair of the given word with the given number of occurrence.
     *
     * @param word the given word
     * @param count the given number of occurrence
     */
    public Pair(String word, int count){
        this.word = word;
        this.count = count;
    }

    /**
     * Getter for the word in this pair
     *
     * @return the word in this pair
     * @param word sd
     */
    public String getWord(){
        return word;
    }

    /**
     * Getter for the count in this pair
     * @return the number of occurrence of the word in this pair
     *
     */
    public int getCount(){
        return count;
    }

    /**
     * Increase the number of occurrence of word in this pair by 1.
     */
    public void incrementCount(){
        this.count++;
    }
}