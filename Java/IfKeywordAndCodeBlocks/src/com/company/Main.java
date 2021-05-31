package com.company;

public class Main {

    public static void main(String[] args) {

	    boolean gameOver = true;
	    int score = 6000;
	    int levelCompleted = 5;
	    int bonus = 100;

	    //If only executing 1 line then {} are not needed vvv
       // if (score == 5000)
        //    System.out.println("Your score was 5000");

        //If more than 1 then {} are needed
//         if (score <= 5000 && score > 1000) {
//             System.out.println("Your score was less than 5000 but greater than 1000");
//         }
//
//         else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//         }
//
//         else {
//             System.out.println("Got here");
//         }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //Challenge
        //Print out a second score on the screen with the following:
        //score set to 10000
        //levelCompleted set to 8
        //bonus set to 200
        //but make sure to first printout above still displays as well

        boolean secondScore = true;
        if (secondScore) {
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            int secondFinal = score + (levelCompleted * bonus);
            System.out.println("Your second score is " + secondFinal);

        }

    }
}
