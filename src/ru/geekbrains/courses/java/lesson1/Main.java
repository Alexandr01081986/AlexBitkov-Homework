package ru.geekbrains.courses.java.lesson1;

public class Main {
    // задание 1
    public static void main(String[] args) {
        byte i = 10;
        short z = 15;
        int x = 40;
        long y = 50L;
        float a1 = 12.35f;
        double j = 123.123;
        char g = 'A';
        boolean hT = true;
        boolean hL = false;

        System.out.println("Значение byte = " + i);
        System.out.println("Значение short = " + z);
        System.out.println("Значение int = " + x);
        System.out.println("Значение long = " + y);
        System.out.println("Значение float = " + a1);
        System.out.println("Значение double = " + j);
        System.out.println("Значение char = " + g);
        System.out.println("Значение boolean hT = " + hT);
        System.out.println("Значение boolean hL = " + hL);
    }

        // задание 2
        float a1 = 12.25f;
        float b1 = 14.56f;
        float c1 = 52.36f;
        float d1 = 12.25f;

        float v1 = prim(a1, b1, c1, d1);

        public static float prim ( float a, float b, float c, float d){
            float v = (a * (b + (c / d)));
            return v;
        }
        //задание 3
        int a3 = 5;
        int b3 = 12;

        boolean sum1 = ret(a3, b3);

        public static boolean ret ( int a2, int b2){
            a2 = 5;
            b2 = 12;
            int sum = a2 + b2;
            if (sum >= 10 || sum <= 20) {
                return true;
            } else {
                return false;
            }
        }
        //задание 4


        public static void chislo(int x1){
            if (x1 >= 0) {
                System.out.println("Вы ввели положительное число =" + x1);
            } else {
                System.out.println("Вы ввели отрицательное цисло =" + x1);
            }
        }

        // задание 5

            int a5 = 5;
            boolean Ot = retOt(a5);

        public static boolean retOt (int a4) {
            a4 = 5;
            if (a4 >= 0) {
             return true;
            } else {
              return false;
         }
    }
        //задание 6

        public static void name(String a6) {
            a6 = "Alex";
            System.out.println("Привет, " + a6 + "!");
        }

        //задание 7

        public static void years(int y, int a, int b) {
            y = 4;
            a = 4;
            b = 400;
            if (((y % a) == 0) || ((y % b) == 0)) {
                System.out.println("Год высокостный");
            } else {
                System.out.println("Год не высокостный");
            }

        }

}
