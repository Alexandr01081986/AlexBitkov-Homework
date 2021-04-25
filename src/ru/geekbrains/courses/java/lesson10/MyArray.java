package ru.geekbrains.courses.java.lesson10;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class MyArray {

    private List<String> arrayList;

    public MyArray(String[] words) {
        arrayList = Arrays.asList(words);
    }

    private String getFrequencyRepeat() {
        String[] unique = getUniqueWords();
        String arr = "";
        int num;
        for (int i = 0; i < unique.length; i++) {
            num = Collections.frequency(arrayList, unique[i]);
            arr += "(" + unique[i] + ", " + num + ") ";
        }
        return arr;
    }

    private String[] getUniqueWords() {
        HashSet<String> arr = new HashSet<>();
        for (String str : arrayList) {
            arr.add(str);
        }
        return arr.toArray(new String[arr.size()]);
    }

    private String[] getAllWords() {
        return arrayList.toArray(new String[arrayList.size()]);
    }

    private void printStrings(String[] arr) {
        String str = "";
        for (String s : arr) {
            str.concat(s);
            str.concat(" ");
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        String[] words = new String[]{"Самолет", "Автомобиль", "Велосипед", "Самокат", "Скейтборд", "Самолет", "Автомобиль",
                "Поезд", "Мопед", "Самокат", "Мопед", "Камаз", "Урал"};

        MyArray myArray = new MyArray(words);

        System.out.println("Всего слов в массиве : " + myArray.getAllWords().length);
        myArray.printStrings(myArray.getAllWords());

        System.out.println("Уникальных слов в массиве : " + myArray.getUniqueWords().length);
        myArray.printStrings(myArray.getUniqueWords());

        System.out.println("Все слова с учетом повторений :");
        System.out.println((myArray.getFrequencyRepeat()));
    }

}
