/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author minely
 */
public class ControladorDato {
    private static final String RUTA_ARCHIVO = "datos.bin";
    private static Listas listas = new Listas();

    public static void cargarDatos() {
        Object obj = leerObjeto(RUTA_ARCHIVO);
        if (obj instanceof Listas) {
            listas = (Listas) obj;
            System.out.println(" Datos cargados correctamente.");
        } else {
            listas = new Listas(); // Por si leer falla
            System.out.println("️ No se encontraron datos previos.");
        }
    }

    public static void guardarDatos() {
        guardarObjeto(listas, RUTA_ARCHIVO);
    }

    public static Listas getListas() {
        return listas;
    }

    public static void setListas(Listas nuevasListas) {
        listas = nuevasListas;
    }

    private static void guardarObjeto(Object o, String ruta) {
        try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream(ruta))) {
            escribe.writeObject(o);
            System.out.println(" Datos guardados.");
        } catch (IOException e) {
            System.out.println(" Error al guardar: " + e.getMessage());
        }
    }

    private static Object leerObjeto(String ruta) {
        try (ObjectInputStream leer = new ObjectInputStream(new FileInputStream(ruta))) {
            return leer.readObject();
        } catch (IOException | ClassNotFoundException e) {
            Logger.getLogger(ControladorDato.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
}
