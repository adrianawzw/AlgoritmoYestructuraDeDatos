package sem7_tareavideo;

public class ListaEnlazada {
    Nodo cabeza;
    
    //Agregar un nuevo producto al inicio.
    public void agregar(int cod, String nombre, int stock){
        Nodo nuevo = new Nodo(cod, nombre, stock);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }
    
    //Eliminar un producto por su código.
    public void eliminar(int codigo){
        if(cabeza==null) return;
        
        if (cabeza.cod == codigo) {
            cabeza = cabeza.siguiente; return;}
        
        Nodo temp = cabeza;
        while(temp.siguiente!=null){
            if (temp.siguiente.cod == codigo) {
                temp.siguiente = temp.siguiente.siguiente; 
            }
            temp = temp.siguiente;
        }
    }
    
    //Mostrar los productos con stock menor a 10.
    public String mostrar(){
        StringBuilder sb = new StringBuilder();
        Nodo temp = cabeza;
        while(temp!=null){
            if (temp.stock<10) {
                sb.append(temp.nombre+"\n");
            }
            temp = temp.siguiente;
        }
        return sb.toString();
    }
}
