/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author minely
 */
public class Proyectofinal {

      
      public static void main (String[] args){
            ControladorDato.cargarDatos();
        Listas listas = ControladorDato.getListas();

        // 🔒 Hook para guardar al salir
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            ControladorDato.guardarDatos();
        }));

        // 🟢 Agregar datos de prueba si está vacío
        if (listas.getLibros() == null || listas.getLibros().isEmpty()) {
            System.out.println("🔄 Agregando datos de prueba...");

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
            usuario.setRol(1);
            usuario.setUsuario("mineprz");

            VentaLibros venta = new VentaLibros();
            venta.setLibroVendido(libro1);
            venta.setVendedor(usuario);

            listas.setLibros(new ArrayList<>(List.of(libro1)));
            listas.setCupones(new ArrayList<>(List.of(cupon)));
            listas.setUsuarios(new ArrayList<>(List.of(usuario)));
            listas.setListaVentas(new ArrayList<>(List.of(venta)));

            ControladorDato.setListas(listas); // IMPORTANTE
        }

        // Mostrar libros como prueba
        System.out.println(" LIBROS EN SISTEMA:");
        for (Libros l : listas.getLibros()) {
            System.out.println("- " + l.getTitulo());
        }
          Login v = new Login();
          v.setVisible(true);
          
       
           Scanner sc = new Scanner(System.in);
        System.out.print("\nPresiona Enter para salir y guardar...");
        sc.nextLine();
      }
    
    }

