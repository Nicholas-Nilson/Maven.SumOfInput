import java.util.Scanner;

public class numSummer {

    int incrementedNumber = 0;
    int sumTotal = 0;
    int userNumber = 0;

    public int summing() {
        if (userNumber > 0) {
            incrementedNumber = 1;
            while (incrementedNumber <= userNumber) {
                sumTotal = sumTotal + incrementedNumber;
                incrementedNumber++;
            }
        }
        if (userNumber < 0) {
            incrementedNumber = -1;
            while (incrementedNumber >= userNumber) {
                sumTotal = sumTotal + incrementedNumber;
                incrementedNumber--;
            }
        }
        return sumTotal;

        //copied from original attempt when all the code was in Main.java
//    int incrementedNumber = 1;
//    int sumTotal = 0;
//    Scanner userInput = new Scanner(System.in);
//        System.out.println("Please enter a whole number");
//    int userNumber = userInput.nextInt();
//        10
//
//                while (incrementedNumber <= userNumber) {
//        sumTotal = sumTotal + incrementedNumber;
//        incrementedNumber++;
//    }
//        System.out.println("Result is " + sumTotal);
    }
}