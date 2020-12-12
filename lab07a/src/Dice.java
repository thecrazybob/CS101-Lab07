/**
 * Lab07
 * Instructions for Lab07a are in README.md file located in the root directory of Lab07a
 * Revisions can be seen on the following GitHub URL: https://github.com/thecrazybob/CS101-lab07
 * Style Guidelines: http://www.cs.bilkent.edu.tr/~david/cs101/practicalwork/2010/styleguidelines.htm
 * Lab Page: http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab07/
 *
 * @author Mohammed Sohail
 * @version 12/12/2020
 */

public class Dice {

    // variables
    int result;

    // initialize two Die objects
    Die die1 = new Die();
    Die die2 = new Die();
    
    /** 
     * Rolls two "Die" objects and returns the sum
     * @return int
     */
    public int roll() {
        
        // variables
        int sum, dice1, dice2;
        
        // roll both die
        dice1 = die1.roll();
        dice2 = die2.roll();

        // sum the result of both
        sum = dice1 + dice2;
        result = sum;

        // return the sum
        return sum;

    }

    
    /** 
     * Returns the value of Die1
     * @return int
     */
    public int getDie1FaceValue() {
        return die1.current_face_of_die;
    }
    
    /** 
     * Returns the value of Die2
     * @return int
     */
    public int getDie2FaceValue() {
        return die2.current_face_of_die;
    }
    
    /** 
     * Returns the sum of Die1 and Die2
     * @return int
     */
    public int getDiceTotal() {
        return result;
    }

    
    /** 
     * Returns the string interpretation of the object
     * @return String
     */
    public String toString() {
        return result + " " + getDie1FaceValue() + " " + getDie2FaceValue();
    }

}
