/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem9;

/**
 *
 * @author tapia
 */
public class ListaEnlazadaDoble {
    Alumno cabeza;
    Alumno cola;
    
    //insertar al final
    public void insertar(String nom, double nota){
        Alumno nuevo = new Alumno(nom, nota);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        }else{
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }
    
    //eliminar el primer
    public boolean eliminar(){
        if (cabeza == null) {
            return false;
        }else{
            if (cabeza==cola) {
                cabeza = cola = null;
            }else{
                cabeza = cabeza.siguiente;
                cabeza.anterior = null;
            }
            return true;
        }
    }
    
    //mostrar
    public String mostrar(){
        if (cabeza == null) {
            return "la lista esta vacia";
        }else{
            StringBuilder sb = new StringBuilder();
            Alumno temp = cabeza;
            while(temp!=null){
                sb.append(temp.nombre).append(" - ").append(temp.nota).append("\n");
                temp = temp.siguiente;
            }
            return sb.toString();
        }
    }
}
