package ru.geekbrains.courses.java.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int attempt = 0;

    public static Scanner GuessTheNumber = new Scanner(System.in);
    public static Random numbers = new Random(10);

    public static void main(String[] args) {

        int correctnumbers = numbers.nextInt(10);
        System.out.print("Угадай число с трех раз,");

        while (attempt < 3) {
            System.out.print("введи от 0 до 9: ");
            int number = GuessTheNumber.nextInt();

            if (number > correctnumbers) {
                System.out.println("Загаданное число меньше:");
                break;
            } else if (number < correctnumbers) {
                System.out.println("Загаданное число больше:");
                break;
            } else if (number == correctnumbers) {
                System.out.println("Вы угадали!");
                break;
            }
            attempt++;
        }
        System.out.print("К сожалению, ваши попытки закончились. Начать игру заново? Да/Нет? нажми Y/N:");

        while (GuessTheNumber.next().equals("Y"));

        GuessTheNumber.close();
    }
    public static void GuessTheWord(String[] args)
        throws IOException {
        String[] words =
                {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin",
                "potato"};
        String guess = getRandomWord(words);
        String maskedGuess = maskWord(guess);
        System.out.println("Угадайте слово");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String myWord = br.readLine();
            myWord = maskWord(myWord);
            if (maskedGuess.equals(myWord)) {
                System.out.println("Вы выйграли, это слово: " + guess);
                break;
            } else {
                String maskedResult = "";
                for (int i = 0; i < maskedGuess.length() - 1; i++) {
                    if (maskedGuess.charAt(i) == myWord.charAt(i)) maskedResult += maskedGuess.charAt(i);
                    else maskedResult += "#";
                }
                System.out.println(maskedResult);
                System.out.println("Не верно, попробуйте еще раз:");
            }
        }

    }

    static String getRandomWord(String[] ns) {
        Random r = new Random();
        return ns[r.nextInt(ns.length - 1)];
    }

    static String maskWord(String ns) {
        String mask = "###############";
        for (int i = ns.length() - 1; i < mask.length() - 1; i++) {
            ns += mask.charAt(i);
        }
        return ns;
    }

}


