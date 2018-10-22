/**
 * This class defines a pair where the first element is a name and second element is the
 * number of occurrence of this name.
 */
public class Pair{

    String name;
    int count;

    /**
     * The constructor that creates a pair of the given name with number of occurrence as 1.
     *
     * @param name the given name
     */
    public Pair(String name){
        this.name = name;
        this.count = 1;
    }

    /**
     * The constructor that creates a pair of the given name with the given number of occurrence.
     *
     * @param name the given name
     * @param count the given number of occurrence
     */
    public Pair(String name, int count){
        this.name = name;
        this.count = count;
    }

    /**
     * Getter for the name in this pair
     *
     * @return the name in this pair
     */
    public String getName(){
        return name;
    }

    /**
     * Getter for the count in this pair
     * @return the number of occurrence of the name in this pair
     *
     */
    public int getCount(){
        return count;
    }

    /**
     * Increase the number of occurrence of name in this pair by 1.
     */
    public void incrementCount(){
        this.count++;
    }
}