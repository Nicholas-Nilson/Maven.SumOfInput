import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
//This program could have been written entirely with much less code, but
    //I realize I need more practice with working with classes & objects.
    //I also wanted to make sure an integer was entered by the user.
    //Didn't write in a way for the program to stop if a particularly stubborn user doesn't want to enter an integer.
    //This program only feels half complete. If a user enters a negative integer, the program doesn't iterate through negatives.
    //To ameliorate this, I would include an if statement in the numSummer class that utilizes negative incrementation.
    //The incremented number variable would start at 0 upon initialization.
    // (if userNumber > 0) I would use the while loop there. (if userNumber < 0)
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