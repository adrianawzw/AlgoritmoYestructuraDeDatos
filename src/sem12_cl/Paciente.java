/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem12_cl;

/**
 *
 * @author tapia
 */
public class Paciente {
    String nombre;
    String motivo;

    public Paciente(String nombre, String motivo) {
        this.nombre = nombre;
        this.motivo = motivo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMotivo() {
        return motivo;
    }  
}
