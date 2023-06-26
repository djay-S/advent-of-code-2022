package day2;

import utils.FileReaderUtils;

import java.io.BufferedReader;
import java.io.IOException;

public class One {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = FileReaderUtils.getQuestionFile("day2/input.txt");

        String gangSign, opponentSign, mySign;
        int totalScore = 0;

        while ((gangSign = bufferedReader.readLine()) != null) {
            String[] signs = gangSign.split(" ");
            opponentSign = signs[0];
            mySign = signs[1];
            totalScore += getScore(opponentSign, mySign);
        }

        System.out.println(totalScore);
    }

    private static int getScore(String opponentSign, String mySign) {
        int gameScore = getGameScore(opponentSign, mySign);
        int mySignScore = getShapeScore(mySign);
        return gameScore + mySignScore;
    }

    private static int getShapeScore(String mySign) {
        if (mySign.equalsIgnoreCase("X"))
            return 1;
        if (mySign.equalsIgnoreCase("Y"))
            return 2;
        if (mySign.equalsIgnoreCase("Z"))
            return 3;
        return 0;
    }

    private static int getGameScore(String opponentSign, String mySign) {
        if ( (opponentSign.equalsIgnoreCase("A") && mySign.equalsIgnoreCase("Y")
        || (opponentSign.equalsIgnoreCase("B") && mySign.equalsIgnoreCase("Z"))
        || (opponentSign.equalsIgnoreCase("C") && mySign.equalsIgnoreCase("X"))) ) {
            return 6;
        }

        if ((opponentSign.equalsIgnoreCase("A") && mySign.equalsIgnoreCase("X")
                || (opponentSign.equalsIgnoreCase("B") && mySign.equalsIgnoreCase("Y"))
                || (opponentSign.equalsIgnoreCase("C") && mySign.equalsIgnoreCase("Z")))){
            return 3;
        }

        return 0;
    }
}
