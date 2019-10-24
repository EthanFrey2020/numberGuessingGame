package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int pickedNumber;

        for (int i = 0; i <1; i++){
            pickedNumber = (int) (Math.random()*100)+1;
            System.out.println(pickedNumber);
        }
    }


}
