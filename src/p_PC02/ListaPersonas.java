/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p_PC02;

/**
 *
 * @author tapia
 */
public class ListaPersonas {
    Persona cabeza;
    int capacidad;
    int inscritos;

    public ListaPersonas(int capacidad) {
        this.cabeza = null;
        this.capacidad = capacidad;
        this.inscritos = 0;
    }
    
    public boolean estaLlenoInscritos(){
        return(inscritos>=capacidad);
    }
    
    public boolean estaListaVacia(){
        return cabeza == null;
    }
    
    public boolean existePersonaDni(String dni){
        if (estaListaVacia()) return false;
        
        Persona temp = cabeza;
        while(temp!=null){
            if (temp.dni.equals(dni)) {
                return true;
            }
            temp = temp.siguiente;
        }
        return false;
    }
    
    public boolean agregar(String nombre, String dni, int edad){
        if (estaLlenoInscritos() || existePersonaDni(dni)) return false;
        
        Persona nuevo = new Persona(nombre, dni, edad);;
        if (estaListaVacia()) {
            cabeza = nuevo;
        }else{
            Persona actual = cabeza;
            while(actual.siguiente!=null){
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        inscritos++;
        return true;
    }
    
    public boolean eliminar(String dni){
        if (!existePersonaDni(dni) || estaListaVacia()) {
            return false;
        }
        
        if (cabeza.dni.equals(dni)) {
            cabeza = cabeza.siguiente;
            inscritos--;
            return true;
        }else{
            Persona temp = cabeza;
            while(temp.siguiente != null && !temp.siguiente.dni.equals(dni)){
                temp = temp.siguiente;
            }
            temp.siguiente = temp.siguiente.siguiente;
            inscritos--;
            return true;
        }
    }
    
    public String mostrar(){
        if (estaListaVacia()) return "lista vacia";
        
        StringBuilder sb = new StringBuilder();
        Persona temp = cabeza;
        while(temp!=null){
            sb.append(temp.nombre).append("\n");
            sb.append(temp.dni).append("\n");
            sb.append(temp.dni).append("\n");
            temp = temp.siguiente;
        }
        return sb.toString();
    }
}
