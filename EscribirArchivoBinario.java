package ArchivoBinario;

import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirArchivoBinario {
    public static void main(String[] args) {
        String nombreArchivo = "archivo_salida.bin";
        try {
            // Create a FileOutputStream to write binary data to the file
            FileOutputStream salida = new FileOutputStream(nombreArchivo);

            // Write integers (0 to 9) as bytes to the file
            for (int i = 0; i < 10; i++) {
                salida.write(i);
            }
            
            // Close the FileOutputStream to release resources
            salida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
