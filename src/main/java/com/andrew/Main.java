package com.andrew;

public class Main {
    public static void main(String[] args) {
         //Якщо програма запутилася без параметрів - викликаємо клас Menu з перегруженим методом mainmenu() який буде приймати від користувача дані.
        if (args.length == 0) {
            Menu.mainmenu();
        }
        //Якщо програма запустилася з параметрами то передаємо ці параметри до меню.
        else
            Menu.mainmenu(args);
    }
}
