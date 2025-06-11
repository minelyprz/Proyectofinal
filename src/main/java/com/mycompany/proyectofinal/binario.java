/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author minely
 */
public class binario {
     public static void main(String[] args) {
         Libros libro1 = new Libros();
        libro1.setTitulo("Cien Años de Soledad");
        libro1.setAutor("Gabriel García Márquez");
        libro1.setGenero("Novela");
        libro1.setCantidad(30);
        libro1.setPrecio(35);
    
        
        Cupones cupon = new Cupones();
        cupon.setcodigo("DGM123");
        cupon.setTipo("porcentaje");
        cupon.setvalor(15.69);
        cupon.setfecha(LocalDate.parse("2025-03-04"));
        
        Usuario usuario = new Usuario();
        usuario.setNombre("Carlos");
        usuario.setPassword("Minely1");
        usuario.setRol(2);
        usuario.setUsuario("mineprz");

        VentaLibros venta = new VentaLibros();
        venta.setLibroVendido(libro1);
        venta.setVendedor(usuario);

        // Crear listas
        ArrayList<Libros> libros = new ArrayList<>();
        libros.add(libro1);

        ArrayList<Cupones> cupones = new ArrayList<>();
        cupones.add(cupon);

        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario);

        List<VentaLibros> ventas = new ArrayList<>();
        ventas.add(venta);

        // Crear objeto contenedor
        Listas listas = new Listas();
        listas.setLibros(libros);
        listas.setCupones(cupones);
        listas.setUsuarios(usuarios);
        listas.setListaVentas(ventas);

        // Guardar en archivo
        guardarObjeto(listas, "/home/minely/datos.bin");

        // Leer desde archivo
        Listas datosLeidos = (Listas) leerObjeto("datos.bin");

        // Verificar
        System.out.println("Libro leído: " + datosLeidos.getLibros().get(0).getTitulo());
        System.out.println("Cupon leído: " + datosLeidos.getCupones().get(0).getcodigo());
        System.out.println("Usuario leído: " + datosLeidos.getUsuarios().get(0).getNombre());
        System.out.println("Venta: " + datosLeidos.getListaVentas().get(0).getLibroVendido().getTitulo());
    }

   public static void guardarObjeto(Object o, String ruta) {
    try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream(ruta))) {
        escribe.writeObject(o);
        System.out.println("✅ Archivo guardado correctamente en: " + new File(ruta).getAbsolutePath());
    } catch (IOException e) {
        System.out.println("❌ Error al guardar: " + e.getMessage());
        e.printStackTrace();
    }
}


    public static Object leerObjeto(String ruta) {
        try (ObjectInputStream leer = new ObjectInputStream(new FileInputStream(ruta))) {
            return leer.readObject();
        } catch (IOException | ClassNotFoundException e) {
            Logger.getLogger(binario.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
     
}
