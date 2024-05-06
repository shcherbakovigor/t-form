package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordChecker {
    public static void wordRandomizer() {

        List<String> wordList = new ArrayList<>();// word record

        try (BufferedReader br = new BufferedReader(new FileReader("./words.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordList.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        for (;;) {
            int randomIndex = random.nextInt(wordList.size()-1);

            String wordForCheck = wordList.get(randomIndex);
            System.out.print(wordForCheck);
            scanner.nextLine();
            System.out.println(TeFormConvertor.convert(wordForCheck));
            scanner.nextLine();

        }
    }
}
