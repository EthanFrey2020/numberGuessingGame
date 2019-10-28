package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String response;
        Scanner keyboard = new Scanner(System.in);
        int pickedNumber;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("For this game, you must try to guess the number I am thinking about between the numbers 1 and 100");
        System.out.println("Let's start off by you taking your first guess.");

        //logic
        int randomNumber = (int) (Math.random()*100)+1;

        do {
            pickedNumber = keyboard.nextInt();
            System.out.println(logic(pickedNumber, randomNumber));
        } while (pickedNumber != randomNumber);

        



            //game loop

            System.out.println("Do you want to play again?");
            response =keyboard.next();

            //logic method

        }

    }


}
