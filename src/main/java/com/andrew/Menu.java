package com.andrew;

import java.util.Scanner;

public class Menu {
    static protected void  mainmenu(){
        Scanner consoleInput = new Scanner(System.in);
        System.out.printf("Choose options: \n1.%s\n2.%s\n3.%s\n4.%s\n",MenuElements.ENCRYPT.getTitle(), MenuElements.DECRYPT.getTitle(), MenuElements.BRUT_FORCE.getTitle(), MenuElements.EXIT.getTitle());
        switch (consoleInput.nextLine()){
            case "1" -> System.out.printf("You choose %s", MenuElements.ENCRYPT.getTitle());
            case "2" -> System.out.printf("You choose %s", MenuElements.DECRYPT.getTitle());
            case "3" -> System.out.printf("You choose %s", MenuElements.BRUT_FORCE.getTitle());
            case "4" -> System.out.printf("You choose %s", MenuElements.EXIT.getTitle());
        }
    }
    static protected void mainmenu(String[] args){
        switch (args[0]){
            case "ENCRYPT" -> System.out.printf("You choose %s", MenuElements.ENCRYPT.getTitle());
            case "DECRYPT" -> System.out.printf("You choose %s", MenuElements.DECRYPT.getTitle());
            case "BRUT_FORCE" -> System.out.printf("You choose %s", MenuElements.BRUT_FORCE.getTitle());
            case "EXIT" -> System.out.printf("You choose %s", MenuElements.EXIT.getTitle());
        }
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
