/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileReader;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import java.io.File;

/**
 *
 * @author minely
 */
public class ArchivoJson {
  

    // Método para cargar los libros desde el archivo JSON
    public static ArrayList<Libros> cargarLibroJson(File archivo) {
        Gson gson = new Gson();
        ArrayList<Libros> libros = new ArrayList<>();
        try (FileReader reader = new FileReader(archivo)) {
            Type tipoLista = new TypeToken<ArrayList<Libros>>() {}.getType();
            libros = gson.fromJson(reader, tipoLista);
            if (libros == null) {
                libros = new ArrayList<>();  // Si el archivo estaba vacío, inicializa la lista.
            }
            System.out.println("libros.json");
        } catch (IOException e) {
            System.out.println("No se encontró el archivo o error al leer JSON, se retorna lista vacía");
        }
        return libros;
    }

     
}