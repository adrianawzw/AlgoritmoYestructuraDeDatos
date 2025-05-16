package sem8;

public class ListaAlumnos {

    private Alumno cabeza;
    private int capacidad;
    private int inscritos;

    public ListaAlumnos(int capacidad) {
        this.cabeza = null;
        this.capacidad = capacidad;
        this.inscritos = 0;
    }

    public boolean estaLleno() {
        return (inscritos >= capacidad);
    }

    public boolean existe(String dni) {
        Alumno temp = cabeza;
        if (temp != null) {
            if (temp.dni.equals(dni)) {
                return true;
            }
            temp = temp.siguiente;
        }
        return false;
    }

    public boolean agregar(String dni, String nombre, int edad) {
        if (estaLleno() || existe(dni)) {
            return false;
        }

        Alumno nuevo = new Alumno(dni, nombre, edad);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Alumno temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
        inscritos++;
        return true;
    }

    public boolean eliminar(String dni) {
        if (!existe(dni)) {
            return false;
        }
        if (cabeza == null) {
            return false;
        }

        if (cabeza.dni.equals(dni)) {
            cabeza = cabeza.siguiente;
            inscritos--;
            return true;
        }

        Alumno temp = cabeza;
        while (temp.siguiente != null && !temp.siguiente.dni.equals(dni)) {
            temp = temp.siguiente;
        }

        if (temp.siguiente != null) {
            temp.siguiente = temp.siguiente.siguiente;
            inscritos--;
            return true;
        }

        return false;
    }

    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        Alumno temp = cabeza;
        while (temp != null) {
            sb.append("DNI: ").append(temp.dni)
                    .append(", Nombre: ").append(temp.nombre)
                    .append(", Edad: ").append(temp.edad).append("\n");
            temp = temp.siguiente;
        }
        return sb.toString();
    }
    
    public boolean buscar(String dni){
        return existe(dni);
    }
    
    public int contarEntre15y17(){
        int cont =0;
        Alumno temp = cabeza;
        while(temp!=null){
            if (temp.edad >= 15 && temp.edad<=17) {
               cont++; 
            }
            temp = temp.siguiente;
        }
        return cont;
    }
    
    public void ordenarPorNombre(){
        if (cabeza==null || cabeza.siguiente==null) return;
        
        boolean cambiado;
        do{
            cambiado=false;
            Alumno temp = cabeza;
            
            while(temp.siguiente!=null){
                if (temp.nombre.compareToIgnoreCase(temp.siguiente.nombre)>0) {
                    String tempdni = temp.dni;
                    String tempnom = temp.nombre;
                    int tempedad = temp.edad;
                    
                    temp.dni = temp.siguiente.dni;
                    temp.nombre = temp.siguiente.nombre;
                    temp.edad = temp.siguiente.edad;
                    
                    temp.siguiente.dni = tempdni;
                    temp.siguiente.nombre = tempnom;
                    temp.siguiente.edad = tempedad;
                    
                    cambiado = true;
                }
                temp = temp.siguiente;
            }
        }while(cambiado);
    }
}
