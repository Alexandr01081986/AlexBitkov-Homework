package ru.geekbrains.courses.java.lesson6;

public class Cat extends Animal {
    @Override
    public boolean run(double run) {
        return (run > 0 && run <= 200);
    }

    @Override
    public boolean swim(double swim) {
        return false;
    }
}
