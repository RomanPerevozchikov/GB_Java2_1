package ru.geekbrains.Java_lvl2_lesson3;

import java.util.TreeMap;
import java.util.TreeSet;

public class PhoneBook {
    private TreeMap<String, TreeSet<String>>book;
    public PhoneBook(){
        book = new TreeMap<>();
    }
    public void add(String name, String number){
        if (!book.containsKey(name)){
            book.put(name, new TreeSet<>());
        }book.get(name).add(number);

    }
    public void get(String name){
        System.out.println(name + " have number(s): " + book.get(name));
    }

}
