package ru.geekbrains.courses.java.lesson8;

public class Cat implements actions {

    private int maxDistance;
    private int maxHeight;
    private boolean ability = false;

    public Cat(int maxDistance, int maxHeight) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    public void run (int distance){
        if (maxDistance >= distance){
            System.out.println("Пробежал");
            ability = true;
        } else {
            System.out.println("Провал");
            ability = false;
        }
    }

    public void jump(int height){
        if (maxHeight >= height){
            System.out.println("Перепрыгнул");
            ability = true;
        } else {
            System.out.println("Провал");
            ability = false;
        }
    }

    public boolean isDone(){
        return ability;
    }
}
