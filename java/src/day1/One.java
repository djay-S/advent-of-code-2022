package day1;

import utils.FileReaderUtils;

import java.io.*;

public class One {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = FileReaderUtils.getQuestionFile("day1/one.txt");

        String elfCalorie;
        int maxCalorie = 0;
        int sumCalorie= 0;

        while ((elfCalorie = bufferedReader.readLine()) != null) {
            if (!elfCalorie.isBlank()) {
                sumCalorie += Integer.parseInt(elfCalorie);
            }
            if (elfCalorie.isBlank()) {
                if (sumCalorie > maxCalorie) {
                    maxCalorie = sumCalorie;
                }
                sumCalorie = 0;
            }
        }

        System.out.println("Max Elf calorie is: " + maxCalorie);
    }
}
