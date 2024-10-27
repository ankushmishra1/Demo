package com.conditionstatement;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rundomNumber = (int) (Math.random()*101);
        int guess = 0;
        while (guess!=rundomNumber){
            System.out.println("Enter Number");
            guess =sc.nextInt();
            if(guess>rundomNumber){
                System.out.println("The is greater");
            }else if (guess<rundomNumber){
                System.out.println("The is low");
            }else{
                System.out.println("Congratulations! You guessed the number.");
            }
        }
    }
}
