package ru.geekbrains.courses.java.lesson8;

public class RunningTrack extends Barrier{
    private int distance = 100;
    public final String TYPE = "Беговая дорожка";

    public RunningTrack(int distance) {
        this.distance = distance;
    }

    @Override
    public String getType(){
        return "Беговая дорожка";
    }

    @Override
    public int getValue(){
        return distance;
    }


}
