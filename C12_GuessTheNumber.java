/*
    A class Game, which allows a user to play "Guess the Number"
    game once. Game have the following methods:
    1. Constructor to generate the random number
    2. takeUserInput() to take a user input of number
    3. isCorrectNumber() to detect whether the number entered by the user is true
    4. getter and setter for noOfGuesses

    Use properties such as noOfGuesses(int), etc to get this task done!
*/

import java.util.Random;
import java.util.Scanner;


class Game {
    private int randomNumber;
    private int guessNumber;
    private int noOfGuesses;

    //constructor that generate random number
    public Game(){
        Random ran = new Random();
        randomNumber = ran.nextInt(100) +1;
    }  

    // take user input

    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your guess");
        guessNumber = sc.nextInt();
        noOfGuesses++;
    } 
    // check it is correct
    public boolean isCorrectNumber(){
        if(guessNumber == randomNumber){
            System.out.println("correct! your guessed the number in "+noOfGuesses+" chance");
            return true;
        }
        else if(guessNumber < randomNumber){
            System.out.println("Too low ... Try again!");
        }
        else {
            System.out.println("Too high ... Try again!");
        }
        return false;
    }
    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }
}

public class C12_GuessTheNumber {

    public static void main(String[] args) {

       Game G = new Game();
       boolean correct = false;

       while (!correct) {
            G.takeUserInput();
            correct = G.isCorrectNumber();
       }
    }
}