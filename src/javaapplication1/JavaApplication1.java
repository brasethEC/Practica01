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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal;
        animal = new Animal("Thor");
        animal.setEdad(5);
        
        System.out.println("El nombre del animal es:"  + animal.getNombre());
        System.out.println("Y la edad es:" + animal.getEdad()+" años");
        
        
    }
    
}
