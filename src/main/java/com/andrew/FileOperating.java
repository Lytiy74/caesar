package com.andrew;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class FileOperating {
   private static Path path;

    protected static String readFile(Path path) {
        String line = "";
        try(FileReader in = new FileReader(path.toString());
            BufferedReader reader = new BufferedReader(in)){

            while(reader.ready()){
                 line = reader.readLine();
            }
            return line;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void writeFile(String line, Path path){
    }
    protected static Path getPath(){
        Scanner consoleScanner = new Scanner(System.in);
        System.out.println("Write path to file: ");
        String consoleInput = consoleScanner.nextLine();
        return Path.of(consoleInput);
    }
}
