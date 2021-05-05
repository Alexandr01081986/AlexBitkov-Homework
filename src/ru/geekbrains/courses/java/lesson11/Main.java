package ru.geekbrains.courses.java.lesson11;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String arr2[] = {"Auto", "Beta", "Ci"} ;
        swap(arr1,1,4);
        swap(arr2,0,2);

        String[] arrayOfStrings = {"Auto", "Beta", "Ci", "Delta"};
        asList(arrayOfStrings);

        Box<Apple> boxWithApple = new Box<>(new Apple(), new Apple(), new Apple());
        Box<Orange> boxWithOranges = new Box<>(new Orange(), new Orange());
        Box<Orange> anotherBoxWithOranges = new Box<>();
        System.out.println("Коробка яблок весит: " + boxWithApple.getWeight());
        System.out.println("Коробка апельсинов весит: " + boxWithOranges.getWeight());
        System.out.println(boxWithApple.compare(boxWithOranges));
        boxWithOranges.replaceFruitsToAnotherBox(anotherBoxWithOranges);
        System.out.println(boxWithOranges.getBox());

    }
    public static void swap(Object[] arr, int n1, int n2){
        System.out.println("Дано: "+ Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println("Результат замены местами: "+Arrays.toString(arr));
    }
    public static <T> void asList(T[]arr){

        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Результат изменения: "+alt);
    }

}
