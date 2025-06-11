/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;
import java.util.ArrayList;

/**
 *
 * @author minely
 */
public class Proyectofinal {
     public static ArrayList<Usuario> usuarios = new ArrayList<>();
      public static void main (String[] args){
          
          Login v = new Login();
          v.setVisible(true);
          
          Usuario admin = new Usuario();
          admin.setNombre("Minely");
          admin.setPassword("admin");
          admin.setRol(1);
          admin.setUsuario("admin");
          
          usuarios.add(admin);
        Usuario vendedor = new Usuario();
        vendedor.setNombre("Lourdes");
        vendedor.setPassword("Astrid1");
          vendedor.setRol(2);
          vendedor.setUsuario("jvendedor");
          usuarios.add(vendedor);
      }
       public static ArrayList<Libros> libros = new ArrayList<>();  
       public static ArrayList<Cupones> cupones = new ArrayList<>();
      
        
     
        
    }

