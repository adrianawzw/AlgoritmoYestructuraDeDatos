/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem9_tareaVideo;

/**
 *
 * @author tapia
 */
public class ListaEnlazada {
    Nodo cabeza;
    
    public void agregar(String nombre, String descripcion){
       Nodo nuevo = new Nodo(nombre, descripcion);
        if (cabeza==null) {
            cabeza=nuevo;
        }else{
            Nodo temp = cabeza;
            while(temp.siguiente!=null){
                temp = temp.siguiente;
            }
            temp.siguiente=nuevo;
        }
    }
    
    public String mostrar(){
        if (cabeza==null) {
            return "lista vacia";
        }else{
            StringBuilder sb = new StringBuilder();
            Nodo temp = cabeza;
            while(temp!=null){
                sb.append(temp.nombre).append("\n");
                temp = temp.siguiente;
            }
            return sb.toString();
        }
    }
    
    public boolean buscar(String nombre){
        if(cabeza == null) return false;
        if(cabeza.nombre.equals(nombre))return true;
        
        Nodo temp = cabeza;
        while(temp!=null){
            if (temp.nombre.equals(nombre)) {
                return true;
            }
            temp = temp.siguiente;
        }
        return false;
    }
    
    public void eliminar(String nombre){
        if(cabeza==null) return;
        
        if (cabeza.nombre.equals(nombre)) {
            cabeza = cabeza.siguiente; 
            return;
        }
        
        Nodo temp = cabeza;
        while(temp.siguiente!=null){
            if (temp.siguiente.nombre.equals(nombre)) {
                temp.siguiente = temp.siguiente.siguiente; 
                break;
            }
            temp = temp.siguiente;
        } 
    }
}
