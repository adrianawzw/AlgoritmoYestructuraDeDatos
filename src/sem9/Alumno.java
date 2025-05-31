/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem9;

/**
 *
 * @author tapia
 */
public class Alumno {
    String nombre;
    double nota;
    Alumno siguiente;
    Alumno anterior;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
        this.siguiente = null;
        this.anterior = null;
    }
    
    
}
