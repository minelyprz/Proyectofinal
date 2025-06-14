/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;
import java.util.List;
/**
 *
 * @author minely
 */
public class Rventa {
     

    public static void agregarVenta(VentaLibros venta) {
         ControladorDato.getListas().getListaVentas().add(venta);
    }
    

    public static List<VentaLibros> obtenerVentas() {
        return ControladorDato.getListas().getListaVentas();
    }
}
