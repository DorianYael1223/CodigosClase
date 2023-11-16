package ArchivoBinario;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class LeerObjeto {
    public static void main(String[] args)  {
        String nombreArchivo = "object.dat";

        try {
            ObjectInputStream entrda = new ObjectInputStream(new FileInputStream(nombreArchivo));
            Mascota m1 = (Mascota) entrda.readObject();
            System.out.println("Nombre: " + m1.getNombre());
            System.out.println("Edad: " + m1.getEdad());
            entrda.close();

        } catch (IOException | ClassNotFoundException e)  {
            e.printStackTrace();
        }
        
    }
}
