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

public class TestDie {
    public static void main(String[] args) {

        // initialize two Die objects
        Die die1 = new Die();
        Die die2 = new Die();

        // call .roll() method on both Die objects
        die1.roll();
        die2.roll();

        // print out "current_face_of_die" for both Die objects
        System.out.println(die1.current_face_of_die);
        System.out.println(die2.current_face_of_die);

    }
}
