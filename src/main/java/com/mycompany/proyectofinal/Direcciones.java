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
public class Direcciones {
    private String calle;
    private String avenida;
    private String direccioncom;
    private String zona;
    
    public Direcciones(String calle, String avenida, String direccioncom, String zona){
        this.calle = calle; 
        this.avenida = avenida; 
        this.direccioncom = direccioncom;
        this.zona = zona;
    }
     
    
    public String getcalle(){
    return calle;
}

public void setCalle (String calle){
    this.calle = calle;
}

     public String getavenida(){
    return avenida;
}

public void setAvenida (String avenida){
    this.avenida = avenida;
}
    public String getdireccioncom(){
    return direccioncom;
}

public void setDireccioncom (String direccioncom){
    this.direccioncom = direccioncom;
} 
    
    public String getzona(){
    return zona;
}

public void setZona (String zona){
    this.zona = zona;
} 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

