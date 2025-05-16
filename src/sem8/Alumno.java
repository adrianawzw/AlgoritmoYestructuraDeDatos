/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem8;

/**
 *
 * @author tapia
 */
public class Alumno {
    String dni;
    String nombre;
    int edad;
    Alumno siguiente;

    public Alumno(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.siguiente = null;
    }
    
}
