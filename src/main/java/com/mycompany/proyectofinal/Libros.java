/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

/**
 *
 * @author minely
 */
public class Libros {
private String titulo;
private String  autor;
private String genero;
private int precio;
private int cantidad;

 public Libros (String titulo, String autor, String genero, int precio, int cantidad){
    this.titulo = titulo;
    this.autor = autor;
    this.genero = genero;
    this.precio = precio;
    this.cantidad = cantidad;
}

public String getTitulo(){
    return titulo;
}

public void setTitulo (String titulo){
    this.titulo = titulo;
}

public String getAutor(){
    return autor;
}

public void setAutor (String autor){
    this.autor = autor;
}

public String getGenero(){
    return genero;
}

public void setGenero (String genero){
    this.genero = genero;
}

public int getPrecio(){
    return precio;
}

public void setPrecio(int precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }

public int getCantidad(){
    return cantidad;
}

public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("La cantidad no puede ser negativa.");
        }
    }



 @Override
public String toString (){
    return "titulo=" + titulo +"\n" + ", autor=" + autor +"\n" + ",  genero=" + genero +"\n" + ",  cantidad=" + cantidad +"\n";
}
    
}
    

