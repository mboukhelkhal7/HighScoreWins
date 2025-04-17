package org.example;

import java.util.Scanner;

public class GameResult {

    static Scanner input = new Scanner(System.in);

    public String teamA;
    public String teamB;
    public int scoreA;
    public int scoreB;
    public String teams;
    public String scores;


    // methods

    public String getScore(){
        System.out.println("please Enter the game score");
        return input.nextLine();       // returning user input
    }

    public void splitScore(String score) {
        teams = score.split("\\|")[0];
        scores = score.split("\\|")[1];

    }

    public void splitTeams() {
        teamA = teams.split(":")[0];
        teamB = teams.split(":")[1];
        scoreA = Integer.parseInt(scores.split(":")[0]);
        scoreB = Integer.parseInt(scores.split(":")[1]);
    }

    public void getWinner() {
        if (scoreA > scoreB){
            System.out.println("the winner is " + teamA);
        } else if (scoreB > scoreA){
            System.out.printf("this winner is " + teamB);
        }else{
            System.out.println("the game is a draw ");
        }


    }
}
