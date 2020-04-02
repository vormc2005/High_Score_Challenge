package com.company;

import javax.print.DocFlavor;

public class Main {

    public static void main(String[] args) {

    int highScorePosition = calculateHighScorePosition(1000);
    displayHighScorePosition("Dmitry", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Jimmy", highScorePosition);

         highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Bully", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Boba", highScorePosition);
        }
    public static void displayHighScorePosition(String playername,int tablePosition) {
        System.out.println(playername + " managed to get in position " + tablePosition);
        }

        public static int calculateHighScorePosition (int playerScore){
//        if(playerScore>=1000){
//            return 1;
//        }else if(playerScore >=500 ){
//            return 2;
//        } else if (playerScore >=100 ){
//            return 3;
//        }else{
//            return 4;
            int position = 4;
            if (playerScore >= 1000){
                position = 1;

        }else if (playerScore >=500){
                position = 2;

            }else if (playerScore >=100){
                position = 3;


            }
            return position;
        }
    }

