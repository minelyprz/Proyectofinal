/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;
import java.util.LinkedList;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author minely
 */
public class Listas implements Serializable{
    private static final long serialVersionUID = 1L;

    private ArrayList<Libros> libros;
    private ArrayList<Cupones> cupones;
    private ArrayList<Usuario> usuarios;
    private List<VentaLibros> listaVentas;
    
    public ArrayList<Libros> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libros> libros) {
        this.libros = libros;
    }

    public ArrayList<Cupones> getCupones() {
        return cupones;
    }

    public void setCupones(ArrayList<Cupones> cupones) {
        this.cupones = cupones;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<VentaLibros> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(List<VentaLibros> listaVentas) {
        this.listaVentas = listaVentas;
    }

}
