// Name: Shaili Trivedi
// Student Number: 0591062
// Course ID: COIS 2240
// Assignment 1 Question 2: Recursive Function for Fibonacci

import java.util.Scanner;

public class FibonacciRec { // calling class FibonacciRec

    public static void main (String args[]){ // main method creation using string argument


        System.out.print(" User input n (Recursive) = "); // Prints written line to prompt user for number of fibonacci sequence
        int number = new Scanner(System.in).nextInt(); // creates new int argument named number to hold the value of n

        //Output for Recursive Function
        System.out.print(" Fibonacci series program output (Recursive):" + num1 + " " + num2 ); //Printing output using recursive method for fibonacci
        long startingTime = System.nanoTime(); // starting time of execution
        fiboSeriesRec( number-2); // calling method fiboSeriesRec and subtracting 2 from number value n for above printed default value of num1 and num2 as o and 1.
        long endingTime = System.nanoTime();// ending time of execution

        long difference = (endingTime - startingTime);// calculating the difference between end time and start time of execution
        System.out.print("\nExecution time for program using the Recursive function is: " + difference +" nanoseconds"); // printing calculated difference

    }

    //Method: fiboSeriesRec
    //Description: recursive function that will produce the Fibonacci series of numbers output up to n which is an input by the user, Recursively.

    static int num1 = 0 , num2 = 1, num3 = 0; // default initialization of values to variables to handle calculation for n value 0 or above.
    static void fiboSeriesRec(int number){ // creating method fiboSeriesRec using remaining value of number after subtraction of 2 for 0 and 1.
        if (number > 0){ // after deducting 1 from number (n input) if value of n becomes 0 recursion stops
            num3 = num1+num2; // num3 is sum of first two numbers
            num1 = num2; // giving new value to num1 from num2 after each addition
            num2 = num3; // giving new value to num2 from num3 after each addition
            System.out.print(" "+num3); // printing output of each addition
            fiboSeriesRec(number-1); // it reduces 1 from remaining number (n input) after printing each time
        }

    }
}

