package day1;

import utils.FileReaderUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Two {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = FileReaderUtils.getQuestionFile("/day1/one.txt");

        String elfCalorie;
        int sumCalorie = 0;
        List<Integer> calorieList = new ArrayList<>();

        while ((elfCalorie = bufferedReader.readLine()) != null) {
            if (!elfCalorie.isBlank()) {
                sumCalorie += Integer.parseInt(elfCalorie);
            }
            if (elfCalorie.isBlank()) {
                calorieList.add(sumCalorie);
                sumCalorie = 0;
            }
        }

        calorieList.sort((n1, n2) -> n2 - n1);
        System.out.println((calorieList.get(0) + calorieList.get(1) + calorieList.get(2)));
    }
}
