/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;
import java.io.Serializable;
import java.time.LocalDate;
/**
 *
 * @author minely
 */
public class Cupones implements Serializable{
     private static final long serialVersionUID = 1L;
    private String codigo;
    private double valor;
    private LocalDate fecha;
    private String tipo;
    private int usosDisponibles;
    
    public Cupones(){
        
    }
    
    public Cupones(String codigo, double valor, LocalDate fecha, String tipo, int usosDisponibles){
        this.codigo = codigo;
        this.valor = valor;
        this.fecha = fecha;
        this.tipo = tipo;
        this.usosDisponibles = usosDisponibles; 
    }
     public int getUsosDisponibles(){
        return usosDisponibles;
    }
    public void setUsosDisponibles(int usosDisponibles){
        this.usosDisponibles = usosDisponibles;
    }
    
    public String getcodigo(){
        return codigo;
    }
    public void setcodigo(String codigo){
        this.codigo = codigo;
    }
    
    public double getvalor(){
        return valor;
    }
    public void setvalor(double valor){
        this.valor = valor;
    }
    public LocalDate getfecha(){
        return fecha;
    }
    public void setfecha(LocalDate fecha){
        this.fecha = fecha;
    }
    public String getTipo() {
    return tipo;
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}
    
    public String toString(){
        return "Codigo:"+codigo+", Valor:" +valor+", Fecha:"+fecha;
    }
    public double getvalor(double total) {
    if (tipo == null) return 0;

    switch (tipo.toLowerCase()) {
        case "porcentaje":
            return total * (valor / 100.0);
        case "fijo":
        case "monto":
            return valor;
        default:
            // Tipo desconocido: no aplica descuento
            return 0;
    }
}
    
    public double getValorOriginal() {
    return valor;
}
}
