/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author brase
 */
public class Animal {
    private String raza;
    private String nombre;
    private int edad;
    
    public Animal(String nombreN){
        nombre = nombreN;
    }
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edadN){
        edad = edadN;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    
}
