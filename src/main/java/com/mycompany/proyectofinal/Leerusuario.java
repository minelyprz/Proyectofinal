/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
/**
 *
 * @author minely
 */
public class Leerusuario {




    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

         Usuario u = new Usuario();
        u.getNombre();
        u.getUsuario();
        u.getPassword();
        u.getRol();

      

        lista.add(u);
       
     
        // Leer desde XML
        ArrayList<Usuario> leidos = leerXML("Usuario.xml");
        for (Usuario U : leidos) {
            System.out.println(U.getNombre() + ", " + U.getUsuario() + ", " + U.getPassword() + ", " + U.getRol());
        }
    }

    public static void escribirXML(String ruta, ArrayList<Usuario> usuarios) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();

            Element root = doc.createElement("Usuarios");
            doc.appendChild(root);

            for (Usuario U : usuarios) {
                Element usuarioElem = doc.createElement("Usuario");

                Element nombre = doc.createElement("Nombre");
                nombre.appendChild(doc.createTextNode(U.getNombre()));
                usuarioElem.appendChild(nombre);

                Element user = doc.createElement("User");
                user.appendChild(doc.createTextNode(U.getUsuario()));
                usuarioElem.appendChild(user);

                Element pass = doc.createElement("Password");
                pass.appendChild(doc.createTextNode(U.getPassword()));
                usuarioElem.appendChild(pass);

               Element rol = doc.createElement("Rol");
                 rol.appendChild(doc.createTextNode(String.valueOf(U.getRol()))); // convertir int a String
                usuarioElem.appendChild(rol);

                root.appendChild(usuarioElem);
            }

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(ruta));
            transformer.transform(source, result);

        } catch (ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Usuario> leerXML(String ruta) {
        ArrayList<Usuario> lista = new ArrayList<>();

        try {
            File archivo = new File(ruta);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(archivo);

            NodeList nodos = doc.getElementsByTagName("Usuario");
            for (int i = 0; i < nodos.getLength(); i++) {
                Node nodo = nodos.item(i);
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element) nodo;

                    Usuario u = new Usuario();
                    u.setNombre(elemento.getElementsByTagName("Nombre").item(0).getTextContent());
                    u.setUsuario(elemento.getElementsByTagName("User").item(0).getTextContent());
                    u.setPassword(elemento.getElementsByTagName("Password").item(0).getTextContent());
                   u.setRol(Integer.parseInt(elemento.getElementsByTagName("Rol").item(0).getTextContent())); 

                    lista.add(u);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
               
}
