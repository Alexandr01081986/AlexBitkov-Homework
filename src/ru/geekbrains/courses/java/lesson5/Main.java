package ru.geekbrains.courses.java.lesson5;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan Ivanovich", "Enginer", "III@mail.ru", "890000000", 30000, 36);
        employees[1] = new Employee("Smirnov Sergey Sergeevich", "Driver", "SSS@mail.ru", "89111111", 29000, 41);
        employees[2] = new Employee("Alexeev Alexey Alexeevich", "Manager", "AAA@mail.ru", "8922222", 45000,45);
        employees[3] = new Employee("Dmitriev Dmitriy Dmitrievich", "Electrician", "DDD@mail.ru", "8933333", 19000, 29);
        employees[4] = new Employee("Borisov Boris Borisovich", "Accountant", "BBB@mail.ru", "89555555", 39000, 39);

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee.toString());
            }
        }
    }

}
