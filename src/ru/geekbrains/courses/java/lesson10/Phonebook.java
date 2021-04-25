package ru.geekbrains.courses.java.lesson10;

import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {

    private HashMap<String, HashSet<String>> record;

    public Phonebook() {
        record = new HashMap<>();
    }

    private void add(String name, String... phone) {
        HashSet<String> ph = new HashSet<>();
        for (String s : phone) {
            ph.add(s);
        }
        if (!record.containsKey(name))
            record.put(name, ph);
        else {
            HashSet<String> phAdd = new HashSet<>();
            String[] s2 = record.get(name).toArray(new String[phAdd.size()]);
            for (String s : s2) {
                ph.add(s);
            }
            record.replace(name, ph);
        }
    }

    private String get(String name) {
        String phones = "Абонент отсутствует в данной телефонной книге";
        if (record.containsKey(name)) {
            phones = record.get(name).toString();
        }
        return phones;
    }

    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();
        phonebook.add("Иванов", "89268959895");
        phonebook.add("Петров", "89158965269");
        phonebook.add("Сидоров", "89095646592");
        phonebook.add("Дорогодчиков", "89268523694");
        phonebook.add("Симонов", "89196549265");
        phonebook.add("Галкин", "89269568423");
        phonebook.add("Сидоров", "89158566593");
        phonebook.add("Иванов", "89206549596");
        phonebook.add("Иванов", "89256935698");

        System.out.println("Иванов : " + phonebook.get("Иванов"));
        System.out.println("Симонов : " + phonebook.get("Симонов"));
        System.out.println("Сидоров : " + phonebook.get("Сидоров"));
        System.out.println("Дорогодчиков : " + phonebook.get("Дорогодчиков"));
        System.out.println("Галкин : " + phonebook.get("Галкин"));
        System.out.println("Галыгин : " + phonebook.get("Галыгин"));
    }
}

