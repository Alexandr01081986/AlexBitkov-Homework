package ru.geekbrains.courses.java.lesson6;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog() {
            @Override
            public boolean run(double run) {
                return false;
            }

            @Override
            public boolean swim(double swim) {
                return false;
            }
        }};

        for (Animal animal : animals) {
            System.out.printf("%s run: %s\n",
                    animal.getClass().getSimpleName(),
                    animal.run(201));


            System.out.printf("%s swim: %s\n\n",
                    animal.getClass().getSimpleName(),
                    animal.swim(8));
        }

        Animal Cat = new Cat();

        Animal Dog = new Dog() {
            @Override
            public boolean run(double run) {
                return false;
            }

            @Override
            public boolean swim(double swim) {
                return false;
            }
        };

        assert !Cat.run(201);
        assert Cat.run(200);

        assert Dog.run(351) == true;
        assert Dog.run(560) == true;
        assert Dog.run(561) == false;
    }
}

