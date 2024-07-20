package org.example.seminar02.cw4;

//TODO : Напишите метод, который  составит строку, состоящую из 100 повторений слова TEST

/**
 * и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Ex1_04 {

    private static final Logger logger = Logger.getLogger(Ex1_04.class.getName());

    public static void main(String[] args) {
        String test100 = "TEST\n".repeat(100);
        System.out.println("test100 = " + test100);
        writeFile(test100, "src/main/java/org/example/seminar02/cw4/test100.txt");
    }

    public static void writeFile(String args, String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(args);
            System.out.println("File written to " + fileName);
        //    throw new IOException();
        } catch (IOException e) {
            FileHandler fh = null;
            try {
                fh = new FileHandler(
                        "src/main/java/org/example/seminar02/cw4/error.log", true);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            logger.addHandler(fh);
            fh.setFormatter(new SimpleFormatter());
            logger.log(Level.WARNING, "Error writing to file: " + fileName);
            System.out.println("Error writing to file: " + fileName);
        }
    }
}
