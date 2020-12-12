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

import java.lang.Math;

public class Lab07a {
    public static void main(String[] args) throws Exception {
        
        // variables
        int dice1;
        int dice2;
        int max;
        int min;
        int range;

        // program code

        // Part (1) and (2) - The old way...
        
        // looping for two dices
        for (int i = 0, sum = 0; sum != 12; i++) {

            // define the range for the dice (1-6)
            max = 6; 
            min = 1; 
            range = max - min + 1; 

            // generate two random numbers using the range above
            dice1 = (int) (Math.random() * range) + min;
            dice2 = (int) (Math.random() * range) + min;

            // calculate the sum of the two random numbers / dices
            sum = dice1 + dice2;

            // print out the sum
            // Uncomment the below code to ouput the values of dice1 and dice2 as well
            // System.out.println("Dice 1: " + dice1);
            // System.out.println("Dice 2: " + dice2);
            System.out.println("Try " + (i+1) + ": " + sum);

        }

    }
}
