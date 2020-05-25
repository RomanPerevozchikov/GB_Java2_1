package ru.geekbrains.Java_lvl2_lesson3;

public class PhoneBookTest {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Petr", "999-245");
        phoneBook.add("Nickolai", "900-985");
        phoneBook.add("Petr", "989-245");
        phoneBook.add("Jana", "959-555");
        phoneBook.add("Victor", "900-142");
        phoneBook.add("Alexander", "901-225");
        phoneBook.add("Jana", "929-520");
        phoneBook.get("Jana");
        phoneBook.get("Nickolai");
        phoneBook.get("Petr");
        phoneBook.get("Victor");
        phoneBook.get("Alexander");


    }
}
