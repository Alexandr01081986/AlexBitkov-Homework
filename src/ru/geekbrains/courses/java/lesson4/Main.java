package ru.geekbrains.courses.java.lesson4;

import java.util.Random;
import java.util.Scanner;

class MainClass {
    public static char [] [] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;

    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static Scanner sc = new Scanner(System.in);
    private final static Random rand = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWinner(DOT_X)) {
                System.out.println("Поздравляю вы победили!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWinner(DOT_O)) {
                System.out.println("Победил компьютер!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    private static boolean checkWinner(char symbol) {
        int endOffset = map.length - DOTS_TO_WIN;

        for (int rowOffset = 0; rowOffset <= endOffset; rowOffset++) {

            if (checkWinDiagonals(symbol, rowOffset)) {
                return true;
            }

            for (int columnOffset = 0; columnOffset <= endOffset; columnOffset++) {

                if (checkWinLines(symbol, rowOffset, columnOffset)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean checkWinLines(char symbol, int rowOffset, int columnOffset) {
        int rowCounter = 0;
        int columnCounter = 0;

        int rowArrayLength = rowOffset + DOTS_TO_WIN;
        int columnArrayLength = columnOffset + DOTS_TO_WIN;

        for (int rowLine = rowOffset; rowLine < rowArrayLength; rowLine++) {
            for (int columnLine = 0; columnLine < columnArrayLength; columnLine++) {
                if (map[rowLine][columnLine] == symbol) {
                    rowCounter++;
                } else {
                    rowCounter = 0;
                }

                if (map[columnLine][rowLine] == symbol) {
                    columnCounter++;
                } else {
                    columnCounter = 0;
                }
            }
            if (columnCounter == DOTS_TO_WIN || rowCounter == DOTS_TO_WIN)
                return true;
        }
        return false;
    }

    public static boolean checkWinDiagonals(char symbol, int rowOffset) {
        int lrDiagonalCounter = 0;
        int rlDiagonalCounter = 0;

        int rowArrayLength = DOTS_TO_WIN + rowOffset;

        for (int rowLine = rowOffset; rowLine < rowArrayLength; rowLine++) {
            if (map[rowLine][rowLine] == symbol) {
                lrDiagonalCounter++;
            } else {
                lrDiagonalCounter = 0;
            }

            if (map[rowLine][map.length - rowLine - 1] == symbol) {
                rlDiagonalCounter++;
            } else {
                rlDiagonalCounter = 0;
            }
            if (rlDiagonalCounter == DOTS_TO_WIN || lrDiagonalCounter == DOTS_TO_WIN)
                return true;
        }
        return false;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }


    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return true;
        }
        return map[x][y] != DOT_EMPTY;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            if (i != 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("  ");
            }
        }

        System.out.println();
        String specialSymbol = " ";
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + specialSymbol);

            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + specialSymbol);
            }
            System.out.println();
        }
        System.out.println();
    }
}

