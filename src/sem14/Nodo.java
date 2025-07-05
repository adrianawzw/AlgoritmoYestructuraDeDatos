/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem14;

/**
 *
 * @author tapia
 */
public class Nodo {
    String nombre;
    Nodo izqmuj;
    Nodo derhom;

    public Nodo(String nombre) {
        this.nombre = nombre;
        izqmuj = derhom = null;
    }
    
    
}
