package runner;

import java.util.Random;
import java.util.Scanner;


public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number" +
                "between 1 to 100");
        int userEnterNumber = 0;
        int attempt = 0;

        while (userEnterNumber != target) {
            System.out.println("Enter The Number");
            userEnterNumber = scanner.nextInt();
            attempt++;
            if (userEnterNumber < target) {
                System.out.println("Too Low!Try again");
            } else if (userEnterNumber > target) {
                System.out.println("Too high! Try again");
            } else {
                System.out.println("Correct..! Guess");
            }

        }


    }
}