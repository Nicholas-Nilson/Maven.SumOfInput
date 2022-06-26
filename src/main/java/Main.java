import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
//This program could have been written entirely with much less code, but
//I realize I need more practice with working with classes & objects.
//I also wanted to make sure an integer was entered by the user.
//Didn't write in a way for the program to stop if a particularly stubborn user doesn't want to enter an integer.
//I've also added a way to sum through negative integers in the posNeg branch.
//this program could also have been written using for loops.
public class Main {

    public static void main(String[] args) {
        numSummer sum1 = new numSummer();

        while (sum1.userNumber == 0) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Please enter a whole number");
            if (!userInput.hasNextInt()) {
                sum1.userNumber = 0;
            } else {
                sum1.userNumber = userInput.nextInt();
            }
            sum1.summing();

        }
        System.out.println("Result is " + sum1.sumTotal);
    }
}