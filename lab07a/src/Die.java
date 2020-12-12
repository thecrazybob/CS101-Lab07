/**
 * Lab07
 * Instructions for Lab07 are in INSTRUCTIONS.md file located in the root directory of Lab07
 * Revisions can be seen on the following GitHub URL: https://github.com/thecrazybob/CS101-lab07
 * Style Guidelines: http://www.cs.bilkent.edu.tr/~david/cs101/practicalwork/2010/styleguidelines.htm
 * Lab Page: http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab07/
 *
 * @author Mohammed Sohail
 * @version 12/12/2020
 */

public class Die {

    // variables
    int current_face_of_die;

    /** 
     * Roll a die and assign the value to "current_face_of_die"
     * @return int
     */
    public int roll() {

        // variables
        int max, min, range, value_of_dice;

        // define the range for the dice (1-6)
        max = 6; 
        min = 1; 
        range = max - min + 1; 

        // generate random number using the range above
        value_of_dice = (int) (Math.random() * range) + min;

        current_face_of_die = value_of_dice;
        
        return value_of_dice;

    }
    
    /** 
     * Returns the result of the roll
     * @return int
     */
    public int getFaceValue() {
        return current_face_of_die;
    }

}
