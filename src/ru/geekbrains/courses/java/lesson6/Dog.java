package ru.geekbrains.courses.java.lesson6;

public class Dog extends Animal {

    @Override
    public boolean run(double run) {
        return (run > 0 && run <= 560);
    }

    @Override
    public boolean swim(double swim) {
        return (swim > 0 && swim <= 10);
    }
}
