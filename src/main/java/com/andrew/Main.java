package com.andrew;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            Menu.mainmenu();
        }
        else
            Menu.mainmenu(args);
    }
}
