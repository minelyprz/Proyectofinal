/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.LocalDate;
import java.io.BufferedWriter;


/**
 *
 * @author minely
 */
public class Archivo {
   
     public static void escribir(String ruta, String contenido, boolean agregar) {
    File archivo = new File(ruta);
    boolean archivoNuevo = !archivo.exists();

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, agregar))) {
      
        if (archivoNuevo) {
            writer.write("Codigo|Desc|Tipo descu|Fecha");
            writer.newLine();
        }

      writer.write(contenido.trim());  
       writer.newLine();
        
    } catch (IOException ex) {
        Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
    }
}

         
         public static void main(String[] args) { 
         
       
        ArrayList<Cupones> cupones = leer("rutaRelativa.csv");
        
        cupones.forEach((c)->{
            System.out.print(c.getcodigo());
            System.out.print(",");
            System.out.print(c.getvalor());
            System.out.print(",");
            System.out.print(c.getTipo());
            System.out.print(",");
            System.out.print(c.getfecha());
            System.out.println("");
        });
        
    }
    
    public static ArrayList<Cupones> leer(String ruta){
    
        ArrayList<Cupones> contenido = new ArrayList<>();
        
        
        try {
            File archivo = new File(ruta);
            FileReader leer = new FileReader(archivo);
            BufferedReader bloque = new BufferedReader(leer);
            String linea = bloque.readLine();
            while(linea !=null){
                String[] cupon = linea.split("\\|");
                Cupones c = new Cupones();
                c.setcodigo(cupon[0].trim());
                c.setvalor(Double.parseDouble(cupon[1].trim()));
                c.setTipo(cupon[2].trim());
                c.setfecha(LocalDate.parse(cupon[3].trim()));
                contenido.add(c);
                linea = bloque.readLine();
            }
            leer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        return contenido;
        
    }
    
}
