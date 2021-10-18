// Name: Shaili Trivedi
// Student Number: 0591062
// Course ID: COIS 2240
// Assignment 1 Question dsfsdfds2: Recursive Function for Fibonacci

import java.util.Scanner;

public class FibonacciIte { // calling the class FibonacciIte

    public static void main (String args[]){ // main method creation using string argument


        System.out.print("User input n (Iterative) = "); // Prints written line to prompt user for number of fibonacci sequence
        int number = new Scanner(System.in).nextInt(); // creates new int argument named number to hold the value of n

        //Output for Iterative Function
        System.out.print ("Fibonacci series program output (Iterative):");
        long startingTime =System.nanoTime(); // starting time of execution

        // for loop to call for method fiboSeriesIte after each cycle
        for (int i = 0; i < number; i++){ // Runs until condition is satisfied and increases value for i by 1 after each run.
            System.out.print (fiboSeriesIte (i) + " "); // to produce output for n using method
        }
        long endingTime = System.nanoTime(); // ending time of execution

        long difference = (endingTime - startingTime);// calculating the difference between end time and start time
        System.out.print("\nTime taken to execute the program using the Iterative function is: " + difference +" nanoseconds");// printing calculated difference
    }
    // Method: fiboSeriesIte
    // Description:FiboSeriesIte method will produce the Fibonacci series of numbers output up to n which is input by user, Interactively.
    public static int fiboSeriesIte(int number){ // creating method for fiboSeriesIte using updated value of number from for loop after each cycle.
        if (number == 1 || number == 2) { // fibonacci calculation for value 1 or 2 passed from main method's for loop
            return 1;
        }
        int num1 = 1, num2 = 1, num3 = 0; // default initialization of values
        for (int i = 2; i < number; i++) { // loop for passed number value 3 or above. After each run it increases value for i by 1. loops run until conditions are met.
            num3 = num1 + num2; // num3 is sum of previous two Fibonacci number
            num1 = num2; // giving new value to num1 from num2 after each addition
            num2 = num3; // giving new value to num2 from num3 after each addition

        }
        return num3; // calculated fibonacci output num3
    }
}
