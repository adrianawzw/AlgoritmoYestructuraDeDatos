/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PC2_repaso;

/**
 *
 * @author tapia
 */
public class ListaEnlazada1 {
    private Nodo cabeza;
    private int capacidad;
    private int inscritos;

    public ListaEnlazada1(int capacidad) {
        this.cabeza = null;
        this.capacidad = capacidad;
        this.inscritos = 0;
    }
   
    public boolean existe(String dni){
        if (cabeza==null)return false;
        
        Nodo temp = cabeza;
        while(temp!=null){
            if (temp.dni.equals(dni)) {
                return true;
            }
            temp = temp.siguiente;
        }
        return false;
    }
    
    public boolean estaLleno(){
        return inscritos>=capacidad;
    }
    
    //agregar final
    public boolean agregarFin(String nombre, String dni, int edad){
        if (existe(dni) || estaLleno()) {
            return false;
        }
        
        Nodo nuevo = new Nodo(nombre, dni, edad);
        if (cabeza==null) {
            cabeza=nuevo;
        }else{
            Nodo temp = cabeza;
            while(temp.siguiente!=null){
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
        inscritos++;
        return true;
        
    }
    
    //mostrar
    public String mostrar(){
        if (cabeza==null) return "Lista Vacia";
        
        Nodo temp = cabeza;
        StringBuilder sb = new StringBuilder();
        while(temp!=null){
            sb.append(temp.nombre).append(" ").append(temp.dni).append(" ").append(temp.edad).append("\n");
            temp = temp.siguiente;
        }
        return sb.toString();
    }
    
    //eliminar con parametro
    public boolean eliminar(String dni){
        if (!existe(dni) || cabeza==null) return false;
        
        if (cabeza.dni.equals(dni)) {
            cabeza = cabeza.siguiente;
            inscritos--;
            return true;
        }
        
        Nodo temp = cabeza;
        while(temp.siguiente!=null){
            if (temp.siguiente.equals(dni)) {
                temp.siguiente = temp.siguiente.siguiente;
                inscritos--;
                return true;
            }
            temp = temp.siguiente;
        }
        return false;
    }
    
    //ordenar por nombre 
    public void ordenar(){
        if (cabeza==null || cabeza.siguiente==null) {
            return;
        }
        
        boolean hubocambio;
        do{
            hubocambio = false;
            Nodo temp = cabeza;
            
            while(temp.siguiente!=null){
                if (temp.nombre.compareToIgnoreCase(temp.siguiente.nombre)>0) {
                    String ntemp = temp.nombre;
                    String dtemp = temp.dni;
                    int etemp = temp.edad;
                    
                    temp.nombre = temp.siguiente.nombre;
                    temp.dni = temp.siguiente.dni;
                    temp.edad = temp.siguiente.edad;
                    
                    temp.siguiente.nombre = ntemp;
                    temp.siguiente.dni = dtemp;
                    temp.siguiente.edad = etemp;
                    
                    hubocambio = true;
                }
                temp=temp.siguiente;
            }
        }while(hubocambio);
    }
    
    
    //ordenar por edad 
    private void ordenarEdad(){
        if (cabeza==null || cabeza.siguiente==null) return;
        
        boolean hubocambio;
        do{
            hubocambio=false;
            Nodo temp = cabeza;
            while(temp.siguiente !=null){
                if (temp.edad>temp.siguiente.edad) {
                    //String nomt = temp.edad;
                    
                }
            }
        }while(hubocambio);
    }
}
