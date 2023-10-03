package com.andrew;

import java.util.*;

public class Menu {
    static protected void  mainmenu(){
        Scanner consoleInput = new Scanner(System.in);
        int optionIndex = 1;
        HashMap<Integer, String> menuOptions = new HashMap<>();
        for (MenuElements elements : MenuElements.values()) {
            menuOptions.put(optionIndex++, elements.getTitle());
        }
        System.out.println("Choose an option:");
        for (Map.Entry<Integer, String> option : menuOptions.entrySet()) {
            System.out.printf("%d. %s\n", option.getKey(), option.getValue());
        }

    }

    static protected void mainmenu(String[] args){
        //will add menu
    }

}

 enum MenuElements {
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
