package ArchivoBinario;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscribirArchivoObjeto {
    public static void main(String[] args) {
        String nombreArchivo = "object.dat";
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
            // Crear un objeto
            Mascota mascota1 = new Mascota("Firulais", 12);
            //Escribir el objeto
            salida.writeObject(mascota1);
            //cerrar
            salida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
