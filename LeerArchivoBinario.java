package ArchivoBinario;

import java.io.FileInputStream;
import java.io.IOException;

public class LeerArchivoBinario {
    public static void main(String[] args) {
        String nombreArchivo = "archivo.bin";
        try {
            // Create a FileInputStream to read from the binary file
            FileInputStream entrada = new FileInputStream(nombreArchivo);
            int byteLeido;

            // Read bytes from the file until the end (-1 indicates end of file)
            while ((byteLeido = entrada.read()) != -1) {
                // Display each byte read from the file
                System.out.println(byteLeido + " ");
            }
            
            // Close the FileInputStream after reading
            entrada.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
