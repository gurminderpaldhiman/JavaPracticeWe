/*
Overview
Write a program that receives an integer value from a user and then calculates and prints out a list that includes all of the factors of that number, whether or not the number is perfect, and whether or not the number is prime.

A perfect number is a number where all the factors of the number, excluding the number itself, add up to that number. For example, the first perfect number is 6 because its factors 1, 2, and 3 add up to 6.

A prime number is defined as a number greater than 1 that has only itself and 1 as factors. For example, 3 is a prime number, but 4 is not.

Sample Program Output
What number would you like to factor? 6
The factors of 6 are:
1 2 3 6
6 has 4 factors.
6 is a perfect number.
6 is not a prime number.
 */
import java.util.Scanner;

public class Factorizer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //user Input
        int count = 0;
        int perfectNumber = 0;
        System.out.print("What number would you like to factor? ");
        //User Input
        int userInput = input.nextInt();

        System.out.println("The factors of "+ userInput + " are:");
        // Loop : to go through the number
        for(int i = 1; i < userInput; i++){
            // IF statement to go through numbers
            if((userInput%i) == 0) {
                System.out.print(i + " ");
                count++;
                perfectNumber = perfectNumber + i;
            }

        }
        System.out.print(userInput);
        System.out.println();
        System.out.println(userInput + " has "+ (count+1) + " factors.");
        // Check the perfect number
        if(perfectNumber == userInput)
            System.out.println(userInput + " is a perfect number");
        else
            System.out.println(userInput + " is not a perfect number");
        // Check the prime number
        if((count+1) == 2)
            System.out.println(userInput + " is a prime number");
        else
            System.out.println(userInput + " is not a prime number");
    }
}

// Goldy ^_^

