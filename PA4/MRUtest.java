/*
 * NAME: TODO First Last
 * PID: TODO Axxxxxxxx
 */

import org.junit.Before;
import org.junit.Test;

import java.util.AbstractList;
import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Test harness for the MRU class
 *
 * @author TODO
 * @since TODO
 */
public class MRUtest {

    MRU<Character> alphabet;
    MRU<String> l1;
    MRU<String> l2;
    AbstractList<Integer> empty;

    /**
     * Performs necessary setup before each test is run
     */
    @Before
    public void setup() {
        alphabet = new MRU<>();
        l1 = new MRU<>();
        l2 = new MRU<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }

        empty = new LinkedList<>();
    }

    //TODO your test cases will go here
    // You will want to test the

    @Test(expected = IndexOutOfBoundsException.class)
    public void TestIndexOutOfBoundsExceptionn(){
        empty.remove(0);
    }

    @Test(expected = NullPointerException.class)
    public  void TestNullPointerException(){
        alphabet.add(null);
    }

    @Test
    public void testOrder(){
        int index = 0;
        for (char c = 'z'; c <= 'a'; c--) {
            assert(alphabet.get(index++)== c);
        }
    }

    @Test
    public void testgetNth0(){
        l2.add("1");
        l2.add("2");
        l2.add("3");
        l1.add("7");
        l1.add("8");
        l1.add("9");

        System.out.println(l2);
        System.out.println(l2.contains("1"));
        System.out.println(l2);

    }



}