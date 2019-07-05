package com.JonMockbee;

public class Main {

    public static void main(String[] args) {
        boolean gameover = true;
        int score = 5000;
        int levelCompleted = 10;
        int bonus = 2000;

    /*    if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000");
        } else if (score < 1000) {
            System.out.println("your score was less than 1000");
        } else {
            System.out.println(" Got here");
        }*/
    if (gameover == true){
        int finalScore = score + (levelCompleted * bonus);
        System.out.println("Your final score was" + finalScore);
 }
//        if (gameover){
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was" + finalScore);
//        }
        score = 10000;
        levelCompleted = 8;
        bonus = 2000;

        if (gameover == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was" + finalScore);
        }
    }
}