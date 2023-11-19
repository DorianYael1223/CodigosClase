package ArchivoBinario;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import java.io.File;

public class LeerArchivoXml {
    public static void main(String[] args) {
        try {
            // Read the XML file "usuarios.xml"
            File xmlFile = new File("usuarios.xml");

            // Set up XML parsing
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            // Print the root element name
            System.out.println("Root Element: " + doc.getDocumentElement().getNodeName());

            // Get a list of "usuario" elements
            NodeList nodeList = doc.getElementsByTagName("usuario");

            // Iterate through each "usuario" element
            for (int i = 0; i < nodeList.getLength(); i++) {
                Element usuario = (Element) nodeList.item(i);
                // Get "nombre" and "edad" elements from each "usuario"
                String name = usuario.getElementsByTagName("nombre").item(0).getTextContent();
                String age = usuario.getElementsByTagName("edad").item(0).getTextContent();
                // Print user details
                System.out.println("\nUser " + (i + 1) + ":");
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
            }
        } catch (Exception e) {
            // Handle exceptions and print stack trace if an error occurs
            e.printStackTrace();
        }
    }
}

