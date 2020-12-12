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

public class DiceGame {

    // initialize instance of Dice
    Dice dice =  new Dice();
    
    /** 
     * Calls .roll() method on Dice object until a sum of 12 is returned
     * @return int
     */
    public int play() {

        // variables
        int i, sum;

        for (i = 0, sum = 0; sum != 12; i++) {
            sum = 0;
            sum = dice.roll();
        }

        return i;

    }

}