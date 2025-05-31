/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem9_tareaVideo;

/**
 *
 * @author tapia
 */
public class ListaEnlazada5 {

    Nodo5 cabeza;

    public void insertarOrdenado(String nombre) {
        Nodo5 nuevo = new Nodo5(nombre);

        if (cabeza == null || cabeza.nombre.compareToIgnoreCase(nombre) > 0) {
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
            return;
        }

        Nodo5 temp = cabeza;
        while (temp.siguiente != null && temp.siguiente.nombre.compareToIgnoreCase(nombre) < 0) {
            temp = temp.siguiente; // Avanzar al siguiente nodo
        }

        // Inserción
        nuevo.siguiente = temp.siguiente;
        temp.siguiente = nuevo;
    }

    public String mostrarLista() {
        if (cabeza == null) {
            return "Lista vacía.";
        }

        StringBuilder sb = new StringBuilder();
        Nodo5 temp = cabeza;
        while (temp != null) {
            sb.append(temp.nombre).append(" -> ");
            temp = temp.siguiente;
        }
        return sb.toString();
    }

    public void eliminarPorNombre(String nombre) {
        if (cabeza == null) {
            return;
        }

        if (cabeza.nombre.equalsIgnoreCase(nombre)) {
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo5 temp = cabeza;
        while (temp.siguiente != null) {
            if (temp.siguiente.nombre.equalsIgnoreCase(nombre)) {
                temp.siguiente = temp.siguiente.siguiente;
                return;
            }
            temp = temp.siguiente;
        }

    }

}
