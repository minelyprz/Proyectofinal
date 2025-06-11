/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author minely
 */
public class VentaLibros implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nitCliente;
    private String nombreCliente;
    private String direccionCliente;
    private Libros librovendido;
    private int cantidad;
    private double total;
    private Usuario vendedor; 
    private LocalDate fecha;
    private double descuento;
    private LocalTime hora; 
    private String tipoDescuento;
    private double valorOriginal;

     public VentaLibros(){
         
     }
     public VentaLibros(Libros libroVendido, int cantidad) {
      this.librovendido = libroVendido;
        this.cantidad = cantidad;
        this.total = libroVendido.getPrecio() * cantidad;
      
    }
     public VentaLibros(String nitCliente, String nombreCliente, double descuento,String direccionCliente, double total, Usuario vendedor,
             LocalDate fecha, LocalTime hora, String tipoDescuento, double valorOriginal, Libros librovendido, int cantidad) {
    this.nitCliente = nitCliente;
    this.nombreCliente = nombreCliente;
    this.descuento = descuento;
    this.direccionCliente = direccionCliente;
    this.total = total;
    this.vendedor = vendedor;
    this.fecha = fecha;
    this.hora = hora;
    this.tipoDescuento = tipoDescuento;
    this.valorOriginal = valorOriginal;
    this.librovendido =  librovendido;
    this.cantidad = cantidad;
    
    
}
    public VentaLibros( String nitCliente, String nombreCliente, String direccionCliente){
        this.nitCliente = nitCliente;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
    }
     public String getNitcliente(){
         return nitCliente;
     }
     public String getTipoDescuento(){
         return tipoDescuento;
     }
     public void setTipoDescuento(String tipoDescuento){
         this.tipoDescuento = tipoDescuento;
     }
     public double getValorOriginal(){
         return valorOriginal;
     }
     public void setValorOriginal(double valorOriginal){
         this.valorOriginal = valorOriginal;
     }
     public double getDescuento(){
         return descuento;
     }
     public LocalTime getHora(){
         return hora;
     }
     public void setHora(LocalTime hora){
         this.hora = hora;
     }
     public void setDescuento(double descuento){
         this.descuento = descuento;
     }
     
     public void setNitcliente(String nitCliente) {
         this.nitCliente = nitCliente;
    }
     public String getNombreCliente(){
         return nombreCliente;
     }
     public LocalDate getFecha(){
         return fecha;
     }
     public void setFecha(LocalDate fecha){
         this.fecha = fecha;
     }
     public void setNombreCliente(String nombreCliente){
      this.nombreCliente = nombreCliente;
     }
     public String getDireccion(){
         return direccionCliente;
     }
     public void setDireccion(String direccionCliente){
      this.direccionCliente = direccionCliente;
     }
     public Libros getLibroVendido(){
         return librovendido;
     }
        public void setLibroVendido(Libros librovendido){
        this.librovendido = librovendido;
     }    
     
     
     public int getCantidad(){
         return cantidad;
     }
     
       public void setCantidad(int cantidad){
      this.cantidad = cantidad;
      this.total = librovendido.getPrecio() * cantidad;
     }    
     
     
     public double getTotal(){
         return total;
     }
     public void setTotal(double total){
      this.total = total;
     }
     
     public Usuario getVendedor(){
         return vendedor;
     }
     public void setVendedor(Usuario vendedor){
          this.vendedor = vendedor;
     }
}
    
    

