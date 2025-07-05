/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem13_cl;

/**
 *
 * @author tapia
 */
public class ArbolBinario {

    Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo raiz, int valor) {
        // Si el árbol está vacío, el nuevo nodo será la raíz
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        // Si el valor es menor que el valor del nodo actual, ir a la izquierda
        if (valor < raiz.valor) {
            raiz.izquierdo = insertarRecursivo(raiz.izquierdo, valor);
        } // Si el valor es mayor o igual, ir a la derecha
        else {
            raiz.derecho = insertarRecursivo(raiz.derecho, valor);
        }

        return raiz;
    }

    // Recorrido en Inorden (izquierda, raíz, derecha)
    public void recorrerInorden() {
        recorrerInordenRecursivo(raiz);
    }

    private void recorrerInordenRecursivo(Nodo raiz) {
        if (raiz != null) {
            recorrerInordenRecursivo(raiz.izquierdo);
            System.out.print(raiz.valor + " ");
            recorrerInordenRecursivo(raiz.derecho);
        }
    }

    // Recorrido en Preorden (raíz, izquierda, derecha)
    /*public void recorrerPreorden() {
        recorrerPreordenRecursivo(raiz);
    }

    private void recorrerPreordenRecursivo(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.valor + " ");
            recorrerPreordenRecursivo(raiz.izquierdo);
            recorrerPreordenRecursivo(raiz.derecho);
        }
    }*/

    // Método público que devuelve el resultado del recorrido Preorden como una cadena
    public String obtenerRecorridoPreorden() {
        StringBuilder resultado = new StringBuilder();
        recorrerPreordenRecursivo(raiz, resultado);
        return resultado.toString();
    }

    // Método recursivo que utiliza StringBuilder
    private void recorrerPreordenRecursivo(Nodo raiz, StringBuilder sb) {
        if (raiz != null) {
            sb.append(raiz.valor).append(" "); // Agrega el valor al StringBuilder
            recorrerPreordenRecursivo(raiz.izquierdo, sb);
            recorrerPreordenRecursivo(raiz.derecho, sb);
        }
    }

    // Recorrido en Postorden (izquierda, derecha, raíz)
    public void recorrerPostorden() {
        recorrerPostordenRecursivo(raiz);
    }

    private void recorrerPostordenRecursivo(Nodo raiz) {
        if (raiz != null) {
            recorrerPostordenRecursivo(raiz.izquierdo);
            recorrerPostordenRecursivo(raiz.derecho);
            System.out.print(raiz.valor + " ");
        }
    }

}
