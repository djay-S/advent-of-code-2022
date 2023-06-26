package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderUtils {
    public static BufferedReader getQuestionFile(String fileName) throws FileNotFoundException {
        String filePath = "/home/djay/Documents/Advent Of Code/java/src/";
        File file = new File(filePath + fileName);

        return new BufferedReader(new FileReader(file));
    }
}
