// 1. Write a Java program to demonstrate syntax, logical & runtime errors.
// 2. Write a Java program that prints “Haha” during an Arithmetic Exception and “Hehe” during an Illegal Argument Exception.
// 3. Write a program that allows you to keep accessing an array until a valid index is given. If max retries exceed 5 print “Error”.
// 4. Modify program in Q3 to throw a custom exception if max retries are reached.
// 5. Wrap the program in Q3 inside a method which throws your custom exception.

import java.util.Scanner;


// Custom Exceptions for Q4 & Q5
class MaxRetriesException extends Exception {
    public String getMessage() {
        return "Maximum retries reached!";
    }
}

class MaxRetriesException2 extends Exception {
    public String getMessage() {
        return "Exceeded max retry limit!";
    }
}

public class A39_Practice_set {
    // problem 1
    public static void solution1() {
        System.out.println("Q1: Demonstrating Errors");

        // Logical Error
        int length = 10, breadth = 5;
        int wrongArea = length + breadth;   // logical error
        int correctArea = length * breadth;

        System.out.println("Wrong Area: " + wrongArea);
        System.out.println("Correct Area: " + correctArea);

        // Runtime error example
        try {
            int a = 5 / 0; // runtime error
        } catch (Exception e) {
            System.out.println("Runtime Error Caught: " + e);
        }

        System.out.println("----------------------------------");
    }
    // problem 2

    public static void solution2() {
        System.out.println("Q2: Exception Messages");

        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Haha");
        }

        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("Hehe");
        }

        System.out.println("----------------------------------");
    }
    // problem 3

    public static void solution3() {
        System.out.println("Q3: Array Access with Retry Limit");

        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);

        int attempts = 0;

        while (true) {
            try {
                System.out.print("Enter index: ");
                int index = sc.nextInt();
                System.out.println("Value: " + arr[index]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid index!");
                attempts++;

                if (attempts >= 5) {
                    System.out.println("Error");
                    break;
                }
            }
        }

        System.out.println("----------------------------------");
    }
    // problem 4

    public static void solution4() {
        System.out.println("Q4: Custom Exception on Max Retries");

        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        int attempts = 0;

        try {
            while (true) {
                try {
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    System.out.println("Value: " + arr[index]);
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid index!");
                    attempts++;

                    if (attempts >= 5) {
                        throw new MaxRetriesException();
                    }
                }
            }
        } catch (MaxRetriesException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("----------------------------------");
    }
    // problem 5
    public static void accessArray() throws MaxRetriesException2 {
        int[] arr = {5, 15, 25, 35, 45};
        Scanner sc = new Scanner(System.in);

        int attempts = 0;

        while (true) {
            try {
                System.out.print("Enter index: ");
                int index = sc.nextInt();
                System.out.println("Value: " + arr[index]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid index!");
                attempts++;

                if (attempts >= 5) {
                    throw new MaxRetriesException2();
                }
            }
        }
    }

    public static void solution5() {
        System.out.println("Q5: Method Throwing Custom Exception");

        try {
            accessArray();
        } catch (MaxRetriesException2 e) {
            System.out.println(e.getMessage());
        }

        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        // Run all solutions
        solution1();
        solution2();
        solution3();
        solution4();
        solution5();
    }
}
