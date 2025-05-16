/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem7_tareavideo;

/**
 *
 * @author tapia
 */
public class ListaEnlazada3 {
    Nodo3 cabeza;
    
    public void agregarOperacion(String oper){
        Nodo3 nuevaOp = new Nodo3(oper);
        
        if (cabeza==null) {
            cabeza= nuevaOp;
        }else{
            Nodo3 actual = cabeza;
            while(actual.siguiente!=null){
                actual = actual.siguiente;
            }
            actual.siguiente = nuevaOp;
        }
    }
    
    public String mostrarOperaciones(){
        StringBuilder sb = new StringBuilder();
        if (cabeza==null) {
            return null;
        }else{
            Nodo3 temp = cabeza;
            while(temp!=null){
                sb.append(temp.operacion+"\n");
                temp = temp.siguiente;
            }
            return sb.toString();
        }
    }
    
    public String mostrarUltimo(){
        if (cabeza==null) {
            return null;
        }else{
            Nodo3 temp = cabeza;
            while(temp.siguiente!=null){
                temp = temp.siguiente;
            }
            return "ultima operacion: "+temp.operacion;
        }
    }
}
