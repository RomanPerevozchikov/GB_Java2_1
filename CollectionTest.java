package ru.geekbrains.Java_lvl2_lesson3;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class CollectionTest {
    public static void main(String[] args) {
        String [] massive = {"Apple", "Orange", "WaterMelon", "Melon", "Coconut","Apple","Apple","Apple","Apple","Melon","Melon","Coconut" };

        HashMap<String, Integer> newMassive = new HashMap<>();

        for (String element : massive){
            newMassive.put(element, newMassive.getOrDefault(element,0)+1);
        }
        System.out.println(newMassive);

        }
    }


