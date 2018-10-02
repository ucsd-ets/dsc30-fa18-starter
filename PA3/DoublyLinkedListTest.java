 /*
  * NAME: TODO First Last
  * PID: TODO Axxxxxxxx
  */

 import org.junit.Before;
 import java.util.AbstractList;
 import java.util.LinkedList;

 import static org.junit.Assert.*;

 /**
  * Test harness for the DoublyLinkedList class
  *
  * @author TODO
  * @since TODO
  */
 public class DoublyLinkedListTest {

     AbstractList<Character> alphabet;
     AbstractList<Integer> empty;
    //TODO: Add any additional lists you may want to test on

     /**
      * Performs necessary setup before each test is run
      */
     @Before
     public void setup() {
         alphabet = new LinkedList<>();
         for (char c = 'a'; c <= 'z'; c++) {
             alphabet.add(c);
         }

         empty = new LinkedList<>();

         //TODO: Initialize any additional lists you may want to test on
     }

     //TODO your test cases will go here


 }