package com.JonMockbee;

public class Main {

    public static void main(String[] args) {
        boolean gameover = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 1000;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000");
        } else if (score < 1000) {
            System.out.println("your score was less than 1000");
        } else {
            System.out.println(" Got here");
        }

    }
}