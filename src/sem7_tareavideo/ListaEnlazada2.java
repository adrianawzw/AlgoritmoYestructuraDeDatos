package sem7_tareavideo;

import javax.swing.JTextArea;

public class ListaEnlazada2 {
    Nodo2 cabeza;
    
    //Agregar un nuevo estudiante al final.
    public void agregar(Estudiante est){
        Nodo2 nuevo = new Nodo2(est);
        if(cabeza==null){
            cabeza = nuevo;
        }else{
            Nodo2 actual = cabeza;
            while(actual.siguiente!=null){
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }
    
    //Mostrar todos los estudiantes registrados en un JTextArea.
    public void mostrar(JTextArea txt){
        StringBuilder sb = new StringBuilder();
        if (cabeza==null) {
            txt.setText("No hay elementos en la lista");
            return;
        }else{
            Nodo2 actual = cabeza;
            while(actual!=null){
                txt.append("Estudiante "+actual.estudiante.nombre+"\n");
                actual = actual.siguiente;
            }
        }
    }
    
    //Buscar un estudiante por su código y mostrar su nombre si existe.
    public boolean existe(int cod){
        if(cabeza==null) return false;
        if(cabeza.estudiante.codigo == cod) return true;
        
        Nodo2 actual = cabeza;
        while(actual!=null){
            if (actual.estudiante.codigo==cod) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }
}
