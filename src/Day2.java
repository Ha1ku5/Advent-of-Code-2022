import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) {
        char opPlay;
        char myPlay;
        int myScore = 0;
        Scanner fileIn = null;
        try{
            fileIn = new Scanner(new FileInputStream("day2.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(1);
        }
        while(fileIn.hasNext()) {
            opPlay = fileIn.next().charAt(0);
            myPlay = fileIn.next().charAt(0);
            myScore += WhatIsScore(opPlay, myPlay);
        }
        System.out.println(myScore);
    }
    //ROCK A -- PAPER
    //PAPER B -- SCISSORS
    //SCISSORS C-- ROCK
    static int WhatIsScore(char op, char my){
        int score = 0;
        switch (my) {
            case 'X' -> {
                if (op == 'A') {
                    score += 3;
                } else if (op == 'B') {
                    score += 1;
                } else {// op chose C
                    score += 2;
                }
            }
            case 'Y' -> {
                score += 3;
                if (op == 'A') {
                    score += 1;
                } else if (op == 'B') {
                    score += 2;
                } else {//op chose C
                    score += 3;
                }
            }
            case 'Z' -> {
                score += 6;
                if (op == 'B') {
                    score += 3;
                } else if (op == 'C') {
                    score += 1;
                } else {
                    score += 2;
                }
            }
        }
        return score;
    }




}
