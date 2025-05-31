/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PC2_repaso;

/**
 *
 * @author tapia
 */
public class Nodo {
    String nombre;
    String dni;
    int edad;
    Nodo siguiente;

    public Nodo(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.siguiente = null;
    }
    
    
}
