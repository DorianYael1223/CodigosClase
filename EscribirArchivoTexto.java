package ArchivoBinario;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivoTexto {
    public static void main(String[] args) {
        // Define the file name
        String fileName = "output_file.txt";
        try {
            // Create a FileWriter to write to the text file
            FileWriter file = new FileWriter(fileName);
            // Create a BufferedWriter for efficient writing
            BufferedWriter writer = new BufferedWriter(file);

            // Write "Hello, world!" to the file
            writer.write("Hello, world!");
            // Add a new line to the file
            writer.newLine();
            // Write "Programming paradigms" to the file
            writer.write("Programming paradigms");

            // Close the BufferedWriter to save changes to the file
            writer.close();
        } catch (IOException e) {
            // Handle any input/output exceptions and print the stack trace if an error occurs
            e.printStackTrace();
        }
    }
}
