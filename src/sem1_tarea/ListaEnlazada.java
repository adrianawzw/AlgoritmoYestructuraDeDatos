package sem1_tarea;

public class ListaEnlazada {

    Nodo cabeza;

    public void insertar(int valor) {
        if (cabeza == null) {
            cabeza = new Nodo(valor);
            return;
        }
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    public int[] mostrar() {
        if (cabeza == null) {
            return new int[0];
        }

        int tamaño = 0;
        Nodo temp = cabeza;

        while (temp != null) {
            tamaño++;
            temp = temp.siguiente;
        }

        int res[] = new int[tamaño];
        temp = cabeza;
        for (int i = 0; i < tamaño; i++) {
            res[i] = temp.valor;
            temp = temp.siguiente;
        }

        return res;
    }

    public int buscar(int valor) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.valor == valor) {
                return temp.valor; 
            }
            temp = temp.siguiente;
        }
        return -1; 
    }
    
    public void eliminar(int valor){
        if (cabeza==null) {
            return;
        }
        
        if (cabeza.valor==valor) {
            cabeza = cabeza.siguiente;
            return;
        }
        
        Nodo temp = cabeza;
        while(temp.siguiente!=null){
            if (temp.siguiente.valor == valor) {
                temp.siguiente = temp.siguiente.siguiente;
                return;
            }
            temp = temp.siguiente;
        }
    }
}
