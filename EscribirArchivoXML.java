package ArchivoBinario;

import java.io.File;
import java.io.FileOutputStream;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class EscribirArchivoXML {
    public static void main(String[] args) {
        try {
            // Create a new XML Document
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            // Root element
            Element rootElement = doc.createElement("users");
            doc.appendChild(rootElement);

            // First user
            Element user1 = doc.createElement("user");
            rootElement.appendChild(user1);
            Element name1 = doc.createElement("name");
            name1.appendChild(doc.createTextNode("Juan"));
            user1.appendChild(name1);
            Element age1 = doc.createElement("age");
            age1.appendChild(doc.createTextNode("25"));
            user1.appendChild(age1);

            // Save the content to an XML file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);

            File xmlFile = new File("users.xml");
            FileOutputStream fileOutputStream = new FileOutputStream(xmlFile);
            StreamResult result = new StreamResult(fileOutputStream);
            transformer.transform(source, result);

            // Display success message
            // System.out.println("XML file created successfully.");

        } catch (Exception e) {
            // Handle exceptions and print stack trace if an error occurs
            e.printStackTrace();
        }
    }
}
