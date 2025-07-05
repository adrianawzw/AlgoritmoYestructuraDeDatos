/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PC3_colas;

/**
 *
 * @author tapia
 */
public class Cliente {
    String nombre;
    String operacion;

    public Cliente(String nombre, String operacion) {
        this.nombre = nombre;
        this.operacion = operacion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", operacion=" + operacion + '}';
    }
    
    
    
}
