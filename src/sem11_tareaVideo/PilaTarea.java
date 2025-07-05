/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem11_tareaVideo;

import java.util.Stack;

/**
 *
 * @author tapia
 */
public class PilaTarea {

    private Stack<NodoTarea> pila;

    public PilaTarea() {
        pila = new Stack<>();
    }

    public void agregar(NodoTarea tarea) {
        pila.push(tarea);
    }

    public NodoTarea eliminar() {
        if (pila.isEmpty()) {
            return null;
        } else {
            return pila.pop();
        }
    }

    public NodoTarea cima() {
        if (pila.isEmpty()) {
            return null;
        } else {
            return pila.peek();
        }
    }


    public int contar() {
        return pila.size(); 
    }
}
