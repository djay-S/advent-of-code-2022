package day2;

import utils.FileReaderUtils;

import java.io.BufferedReader;
import java.io.IOException;

public class Two {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = FileReaderUtils.getQuestionFile("day2/input.txt");

        String gangSigns;
        int totalScore = 0;

        while ((gangSigns = bufferedReader.readLine()) != null) {
            String[] signs = gangSigns.split(" ");
            String opponentSign = signs[0];
            String desiredRes = signs[1];

            totalScore += getScore(opponentSign, desiredRes);;
        }

        System.out.println(totalScore);
    }

    private static int getScore(String opponentSign, String desiredRes) {
        int gameScore = getGameScore(desiredRes);
        int mySignScore = getMyDesiredSign(opponentSign, desiredRes);
        return gameScore + mySignScore;
    }

    public static int getMyDesiredSign(String opponentSign, String desiredRes) {
        if (desiredRes.equalsIgnoreCase("X")) {
            if (opponentSign.equalsIgnoreCase("A")) {
                return 3;
            }
            if (opponentSign.equalsIgnoreCase("B")) {
                return 1;
            }
            if (opponentSign.equalsIgnoreCase("C")) {
                return 2;
            }
        }

        if (desiredRes.equalsIgnoreCase("Y")) {
            if (opponentSign.equalsIgnoreCase("A")) {
                return 1;
            }
            if (opponentSign.equalsIgnoreCase("B")) {
                return 2;
            }
            if (opponentSign.equalsIgnoreCase("C")) {
                return 3;
            }
        }

        if (desiredRes.equalsIgnoreCase("Z")) {
            if (opponentSign.equalsIgnoreCase("A")) {
                return 2;
            }
            if (opponentSign.equalsIgnoreCase("B")) {
                return 3;
            }
            if (opponentSign.equalsIgnoreCase("C")) {
                return 1;
            }
        }
        return 0;
    }

    private static int getGameScore(String desiredRes) {
        if (desiredRes.equalsIgnoreCase("X"))
            return 0;
        if (desiredRes.equalsIgnoreCase("Y"))
            return 3;
        if (desiredRes.equalsIgnoreCase("Z"))
            return 6;
        return 0;
    }
}
