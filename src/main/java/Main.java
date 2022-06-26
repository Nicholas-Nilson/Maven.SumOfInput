import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */

//the program is working as intended, but I would like to reprogram it so the summing method is in another class. It is something I need to practice.
public class Main {

    public static void main(String[] args){

        int incrementedNumber = 1;
        int sumTotal = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a whole number");
        int userNumber = userInput.nextInt();
        10

        while (incrementedNumber <= userNumber) {
            sumTotal = sumTotal + incrementedNumber;
            incrementedNumber++;
        }
        System.out.println("Result is " + sumTotal);

    }
}
