package ru.geekbrains.courses.java.lesson8;

public class Wall extends Barrier{
    public final String TYPE = "Стена";
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public String getType(){
        return "Стена";
    }
    @Override
    public int getValue(){
        return height;
    }



}
