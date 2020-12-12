/**
 * Lab07
 * Instructions for Lab07b are in README.md file located in the root directory of Lab07b
 * Revisions can be seen on the following GitHub URL: https://github.com/thecrazybob/CS101-lab07
 * Style Guidelines: http://www.cs.bilkent.edu.tr/~david/cs101/practicalwork/2010/styleguidelines.htm
 * Lab Page: http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab07/
 *
 * @author Mohammed Sohail
 * @version 12/12/2020
 */

public class LibraryBook {

    // variables
    String title, author, dueDate;
    int timesLoaned;

    public LibraryBook() {

        title = "The art of living : the classic manual on virtue, happiness, and effectiveness";
        author = "Epictetus.";
        dueDate = "12.12.2020";
        timesLoaned = 0;
    
    }

    public void loanBook() {
        timesLoaned += 1;
        dueDate = "22.12.2020";
    }

    public void returnBook() {
        dueDate = "";
    }

    public int getTimesLoaned() {
        return timesLoaned;
    }

    public boolean onLoan() {
        return (dueDate == "") ? false : true;
    }

    public String toString() {
        return "title: " + title + " author: " + author + " dueDate: " + dueDate + " timesLoaned: " + timesLoaned;
    }
}
