/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem6;

/**
 *
 * @author tapia
 */
public class Pila {
    Nodo cima;
    
    class Nodo{
        String dato;
        Nodo siguiente;

        public Nodo(String dato) {
            this.dato = dato;
            this.siguiente = null;
        }
        
    }
    
    public void push(String dato){
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
    }
    
    public void pop(){
        if (cima!=null) {
            cima = cima.siguiente;
        }
    }
    
    public String top(){
        return (cima !=null) ? cima.dato : null;
    }
    
    public boolean isEmpty(){
        return cima==null;
    }
    
    public String mostrarDatos(){
        StringBuilder sb = new StringBuilder();
        Nodo actual = cima;
        while(actual!=null){
            sb.append(actual.dato+"\n");
            actual = actual.siguiente;
        }
        return sb.toString();
    }
}
