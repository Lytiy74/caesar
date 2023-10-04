package com.andrew;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.util.*;

public class Menu {
    private static int optionIndex = 1;
    private static int userOption = -1;
    private final static HashMap<Integer, String> menuOptions = new HashMap<>();
    static protected void  mainmenu(){
        Scanner consoleScanner = new Scanner(System.in);
        String consoleInput;

        //Додаємо всі елементи множини MenuElements в колекцію MenuOptions.
        for (MenuElements elements : MenuElements.values()) {
            menuOptions.put(optionIndex++, elements.getTitle());
        }
        do {
            //Виводимо в консоль всі елементи меню з мапи.
            System.out.println("Choose an option:");
            for (Map.Entry<Integer, String> option : menuOptions.entrySet()) {
                System.out.printf("%d. %s\n", option.getKey(), option.getValue());
            }

            //Якщо користувач ввів в консоль числове значення(тобто ключ) перевіряємо чи є цей ключ в колекції і якщо істина то присвоюємо це в поле userOption.
            if (consoleScanner.hasNextInt()){
                consoleInput = consoleScanner.nextLine();
                if (menuOptions.containsKey(Integer.parseInt(consoleInput)))
                    userOption = Integer.parseInt(consoleInput);
            }
            //У випадку якщо користувач ввів текстовий варіант меню. Перебираємо всю колекцію і присвоюємо ключ до поля userOption
            else{
                consoleInput = consoleScanner.nextLine();
                for (Map.Entry<Integer, String> option:menuOptions.entrySet()) {
                    if (consoleInput.equals(option.getValue()))
                        userOption = option.getKey();
                }
            }
        }while(userOption == -1);
        switch (userOption){

        }

    }

    static protected void mainmenu(String[] args){
        //Згідно умови отримуємо аргументи типу command filePath key.

    }

}

 enum MenuElements { // Поле з елементами меню
    ENCRYPT ("Encrypt"),
    DECRYPT("Decrypt"),
    BRUT_FORCE("BRUT_FORCE"),
    EXIT("EXIT");

    private final String title;
    MenuElements(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

}
