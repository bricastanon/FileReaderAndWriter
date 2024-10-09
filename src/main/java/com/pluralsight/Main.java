package com.pluralsight;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("src/example.txt");
            Scanner scanner = new Scanner(file); // This will throw FileNotFoundException
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: File not found");
        }

        // The file to write the data
        String fileName = "dbz_powerlevels.txt";
        // Array of characters and their power levels
        String[] characters = {
                "Goku: 9000",
                "Vegeta: 8500",
                "Piccolo: 7000",
                "Gohan: 6000",
                "Frieza: 12000",
                "Cell: 15000",
                "Majin Buu: 20000" };
        // Try-with-resources to ensure the file is closed properly
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Write each character and their power level to the file
            for (String character : characters) {
                writer.write(character);
                writer.newLine(); // Move to the next line
                }
                System.out.println("File written successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file.");
            e.printStackTrace(); }
        }
        // ^^ literally write a file.txt and I can drag it to my desktop




            //" file.delete(); " literally deletes teh file  ******
    }
