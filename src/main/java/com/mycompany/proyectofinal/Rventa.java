/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author minely
 */
public class Rventa {
     private static final List<VentaLibros> listaVentas = new ArrayList<>();

    public static void agregarVenta(VentaLibros venta) {
        listaVentas.add(venta);
    }
    

    public static List<VentaLibros> obtenerVentas() {
        return listaVentas;
    }
}
