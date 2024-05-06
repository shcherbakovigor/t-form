package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordChecker {
    public static void wordRandomizer() {

        List<String> wordList = new ArrayList<>();// word record

        for (int i = 0; i < 20; i++) {
            wordList.add("する");
        }

        Random random = new Random();


        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int randomIndex = random.nextInt(12);

            String wordForCheck = wordList.get(randomIndex);
            System.out.println(wordForCheck);
            System.out.println(TeFormConvertor.convert(wordForCheck));
            System.out.println(randomIndex);
            scanner.nextLine();

            System.out.print("\033[H\033[2J");
            System.out.flush();

        }
    }
}
