/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;
import java.time.LocalDate;
/**
 *
 * @author minely
 */
public class Cupones {
    private String codigo;
    private double valor;
    private LocalDate fecha;
    private String tipo;
    
    public Cupones(){
        
    }
    
    public Cupones(String codigo, double valor, LocalDate fecha, String tipo){
        this.codigo = codigo;
        this.valor = valor;
        this.fecha = fecha;
        this.tipo = tipo;
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
}
